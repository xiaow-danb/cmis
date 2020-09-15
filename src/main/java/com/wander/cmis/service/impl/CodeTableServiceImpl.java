package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.InitBean1;
import com.wander.cmis.bean.V_AAA027ApiDTO;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.service.CodeTableService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CodeTableServiceImpl implements CodeTableService {
    @Override
    public void codeSync() {
        /**
         * 调用就业局接口获取码值
         * 把获取到的code当做parentcode以调用接口获取全部码值数据
         */
        String s = doJyjApi(new V_AAA027ApiDTO());
        List<InitBean1> initBean1s = JSONObject.parseArray(s, InitBean1.class);
        List<InitBean1> list = new ArrayList<>();
        initBean1s.forEach(x -> {
            V_AAA027ApiDTO v_aaa027ApiDTO = new V_AAA027ApiDTO();
            v_aaa027ApiDTO.setParentcode(x.getCode());
            String result1 = doJyjApi(v_aaa027ApiDTO);
            List<InitBean1> initBean1s1 = JSONObject.parseArray(result1, InitBean1.class);
            list.addAll(initBean1s1);
        });
        //TODO 保存码值
    }

    private String doJyjApi(V_AAA027ApiDTO v_aaa027ApiDTO) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "areaCodeApi";
        String param2 = "getCodeList";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = v_aaa027ApiDTO;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
