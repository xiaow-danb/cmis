package com.wander.cmis.init;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.CodeTable;
import com.wander.cmis.commons.InitAndRun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Order(1)
public class FirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    Logger logger = LoggerFactory.getLogger(FirstInitializer.class);

    /**
     * TODO 这里只是一个业务场景的例子 如果考虑效率可以改为多场景批量初始化
     *
     * @param configurableApplicationContext
     */
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        //调用就业局接口获取 申请人类型
        String applyPersonType = getApplyPersonType();
        JSONObject jsonObject = (JSONObject) JSONObject.parse(applyPersonType);
        String data = jsonObject.getString("result");
        List<CodeTable> applyPersonTypes = JSONObject.parseArray(data, CodeTable.class);
        Map<String, Object> initmap = new HashMap<>();
        applyPersonTypes.stream().forEach(x -> {
            initmap.put(x.getText(), x.getId());
        });
        //调用就业局接口获取 资产权属
        String asertOwner = getAsertOwner();
        JSONObject jsonObject1 = (JSONObject) JSONObject.parse(asertOwner);
        String data1 = jsonObject1.getString("result");
        List<CodeTable> codeTables1 = JSONObject.parseArray(data1, CodeTable.class);
        codeTables1.stream().forEach(x -> {
            initmap.put(x.getText(), x.getId());
        });


        MapPropertySource firstInitializer = new MapPropertySource("FirstInitializer", initmap);
        environment.getPropertySources().addLast(firstInitializer);
        logger.info("初始化数据----->" + initmap);
    }

    /**
     * 资产权属
     *
     * @return
     */
    private String getAsertOwner() {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
        String param1 = "aA10CodeApi";
        String param2 = "getCodeCollection";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = "TAD009";
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

    /**
     * 获取申请人类型
     *
     * @return
     */
    public String getApplyPersonType() {
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
        String param1 = "aA10CodeApi";
        String param2 = "getCodeCollection";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = "CCA080@2";
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }
}
