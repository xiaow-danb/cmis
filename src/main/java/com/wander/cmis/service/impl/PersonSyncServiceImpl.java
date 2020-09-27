package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.PersonBaseInfoApiDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.ErrorLog;
import com.wander.cmis.entity.ExchangePolguaapp;
import com.wander.cmis.mapper.ErrorLogMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.PersonSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PersonSyncServiceImpl implements PersonSyncService {

    Logger logger = LoggerFactory.getLogger(PersonSyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Override
    public void doPersonSync() {
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.personalText();
        exchangePolguaapps.stream().forEach(exchangePolguaapp -> {
            PersonBaseInfoApiDTO personBaseInfoApiDTO = new PersonBaseInfoApiDTO();
            //国籍或地区 固定传中国
            personBaseInfoApiDTO.setAac161("001");
            //证件类型  aac058
            personBaseInfoApiDTO.setAac058("1");
            //证件号码  aac002
            personBaseInfoApiDTO.setAac002(exchangePolguaapp.getCredentialno());
            //姓名    aac003
            personBaseInfoApiDTO.setAac003(exchangePolguaapp.getClientname());
            //性别    aac004
            personBaseInfoApiDTO.setAac004(exchangePolguaapp.getGender());
            //出生日期  aac006
            String credentialno = exchangePolguaapp.getCredentialno();
            String substring = credentialno.substring(6, 14);
            personBaseInfoApiDTO.setAac006(new BigDecimal(substring));
            //手机号   aac067
            personBaseInfoApiDTO.setAac067(exchangePolguaapp.getContactway());
            //渠道来源  小贷公司固定传"50"
            personBaseInfoApiDTO.setCaa999("50");
            String s = doRegistPersonInfo(personBaseInfoApiDTO);
            JSONObject jsonObject = JSONObject.parseObject(s);
            String statusCode = jsonObject.getString("statusCode");
            if (!"200".equals(statusCode)) {
                logger.info("就业局系统绑定人员信息失败!!!!");
            } else {
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("2.4.2.1 人员基本信息新增或更新接口");
                String send = JSONObject.toJSON(personBaseInfoApiDTO).toString();
                errorLog.setSendData(send);
                errorLog.setResultData(s);
                errorLogMapper.insert(errorLog);
            }
        });
    }

    /**
     * 2.4.2.1 人员基本信息新增或更新接口
     * @param personBaseInfoApiDTO
     * @return
     */
    private String doRegistPersonInfo(PersonBaseInfoApiDTO personBaseInfoApiDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "personBaseApi";
        String param2 = "personBaseInfoSaveOrUpdate";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = personBaseInfoApiDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
