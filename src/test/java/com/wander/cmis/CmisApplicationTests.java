package com.wander.cmis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Exchanger;

@SpringBootTest
class CmisApplicationTests {

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeProjectLoanMapper exchangeProjectLoanMapper;

    @Resource
    private ExchangeShareholderMapper exchangeShareholderMapper;

    @Test
    void test() {
//        List<ExchangeCollateralinfo> exchangeCollateralinfos = exchangeCollateralinfoMapper.selectAll();
//        System.out.println(exchangeCollateralinfos);
//        ExchangeEmployee exchangeEmployee = new ExchangeEmployee();
//        exchangeEmployee.setId("CQJYJLDE1000001109D");
//        ExchangeEmployee exchangeEmployee1 = exchangeEmployeeMapper.selectByPrimaryKey(exchangeEmployee);
//        System.out.println(exchangeEmployee1);


        ExchangeGuarantorinfo exchangeGuarantorinfo = new ExchangeGuarantorinfo();
        exchangeGuarantorinfo.setId("1128069");
        ExchangeGuarantorinfo exchangeGuarantorinfo1 = exchangeGuarantorinfoMapper.selectByPrimaryKey(exchangeGuarantorinfo);

//        ExchangePolguaapp exchangePolguaapp = new ExchangePolguaapp();
//        exchangePolguaapp.setId("2799894");
//        ExchangePolguaapp exchangePolguaapp1 = exchangePolguaappMapper.selectByPrimaryKey(exchangePolguaapp);

//        ExchangeProjectLoan exchangeProjectLoan = new ExchangeProjectLoan();
//        exchangeProjectLoan.setId("8a8ab54356781ba001568826e1fb12de");
//        ExchangeProjectLoan exchangeProjectLoan1 = exchangeProjectLoanMapper.selectByPrimaryKey(exchangeProjectLoan);

//        ExchangeShareholder exchangeShareholder = new ExchangeShareholder();
//        exchangeShareholder.setId("0609a184d3e5423793968f272c65ca5f");
//        ExchangeShareholder exchangeShareholder1 = exchangeShareholderMapper.selectByPrimaryKey(exchangeShareholder);
        System.out.println(exchangeGuarantorinfo1);
    }

    @Test
    void test2() {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));


        String param1 = "aA10CodeApi";
        String param2 = "getCodeCollection";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = "AAA027";
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        InitAndRun.run(url, param1, param2, jsonstr);
    }
}
