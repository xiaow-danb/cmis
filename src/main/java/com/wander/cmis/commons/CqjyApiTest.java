package com.wander.cmis.commons;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wondersgroup.wssip.framework.utils.DateTools;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;


@Component
@Configuration
public class CqjyApiTest {

     public static void main(String[] args) {
        CqjyApiTest obj = new CqjyApiTest();
        String str="getCodeCollection";//获取就业系统码表接口
        obj.testJsonBoby(str);
    }

    private static SerializeConfig serconfig = new SerializeConfig();

    public CqjyApiTest(){
        String  dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
    }

    public void testJsonBoby(String str){
        HttpResponse result =null;
        //获取就业系统码表接口
        if("getCodeCollection".equals(str)){
            String url="http://10.10.53.241:8106/ecooppf/rest/aA10CodeApi/getCodeCollection";
            Object[] params = new Object[1];
            params[0] = "AAA038";
            String jsonstr  = JSON.toJSONString(params,serconfig);
            System.out.println(jsonstr);
            result = restreq(url,"aA10CodeApi","getCodeCollection",jsonstr);
        }
        String resData=null;
        try {
            resData = EntityUtils.toString(result.getEntity(),"utf-8");
            System.out.println("返回信息："+resData);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static HttpResponse restreq(String url, String sname, String tname, String reqmsg){

        //HttpClient httpClient = new DefaultHttpClient();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost method = new HttpPost(url);
        String reqtime =  DateTools.format(new Date(), "yyyyMMddHHmmss");
        String signcontent= MsgSignatureUtils.getSignatureString(sname, tname, reqtime, reqmsg);
        String signature = MsgSignatureUtils.signByPrivateKeyWithSha1Rsa("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAICm7bEP0g2IPKMO+/5whsPhZCIHwnadyqItpkK+pFMay13WxG2t111TMT/W+A17qVmVOaLAp1k8biekZ6ZUnmvWTVoc8JDLNrIVSEnk9mbqAzkKv0XgPaC3Q46xtdHRrEfzALmqtd50JpYFAH95O4CRd86jl2RfhQHILgnjpckPAgMBAAECgYBlmO3+tTqxuxP/xTaV4fFbQWSdRzl4CPZcCubQsNL+WhueGJv47Z81MRykiLRNmYnMl/7zG2dNHl7zaW79OLf928H81UWt34CqJw3wUM7AsXJdCVgivIRjwyaQgf45Qv8QjpqVfC1rU/aNh+6pLMJVs7R+kMErZadGAxA2JYCUOQJBAMPJfdvYqJvgvWL9NE2PxnkkaeTb1FaIyVNXlMZx8j9AVv2ZJ56qY/2PXxhU5MBzSCN+8zgJAHw18fgdsZV8APUCQQCoN9TgwAst/h1gfBEIN7Z3VcHjYOh4btqHUkixPEoNOAqDZQwihEgHLdCJdHEZ0pnBH+/oJaFIhfkkTfiLdw9zAkBY9m5k/g6nPbhwiWNBtwnVM/GWFzll1KO+ZfZpMY+EpCSi+PuiwgPLTGFGehSzSe7GikHT/WsmBZEcT8nIhd8dAkA5jVCBzHKGu8glOI1DOHxu+6IoPwGKIrMVVSuVp8DWIPRH3Ax4yrUx75THUlVXtlvwXRLhY+54N43zw9FjNcrNAkB5MxEt54LgdcUut+7xFtduK/JLdSUrvtrBDW1Q0qPxmM8NyzUlAtjfRT5og+CL2wbotXEQWAfwdeFtlWgAHrYz",
                signcontent);
        StringEntity entity = new StringEntity(reqmsg,"utf-8");//解决中文乱码问题
        //System.out.println("---"+entity);
        method.addHeader("Content-type","application/json; charset=utf-8");
        method.setHeader("Accept", "application/json");
        method.setHeader("username", "cqxwdb");
        method.setHeader("accesskey", "8EqeKY04");
        method.setHeader("signature", signature);
        method.setHeader("reqtime",reqtime);
        if(entity!=null){
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            method.setEntity(entity);
        }

        HttpResponse result = null;
        try {
            result = httpclient.execute(method);
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
}
