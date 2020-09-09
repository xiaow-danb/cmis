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

import java.io.IOException;
import java.util.Date;


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
        System.out.println("reqmsg=="+reqmsg);
        String signature = MsgSignatureUtils.signByPrivateKeyWithSha1Rsa("MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKQF3oQfqAwOY/mhpY7+p7AIhOA2z5IXLwA3sddAGBaaM/lvqD/OUhMV+ZuMyHnQakRXNKgPBLfrUmTsa+lam4xIMFKF3EwknwAaMYVZti6/JR5zk97IhGMaDaf9f6VHkl1akj/Jj7cUtolQJq1tn4868Zsck1A8Q2Bj1cMLqBwbAgMBAAECgYAJhJmr+xZKVM9yXfH4gUiDy4rCZAvZg2Tj01eLkRmUvjAD6nnN8hALMXxBjYLYpsJz4seYdP6mGY63coy0huB9xK0uzqaQD/BS8W6FbK2TLZLamgnselLz84JADgvr8e7TuR+cWalqxYk2UtYQ/ME6C99MXP5MrC+jOfHHQJ6MUQJBANEcRjFmSHLRYm/CL14oXGYSS04TbI1E3IHZJUZCbCIbe3zxHiG3dhroHh6uYMZINDzhH8j290gxAkxElIkomrkCQQDIzWbhU7P1oYhGpHURoikbelgIuQYKAv2k6gWfv2lal2sxNmelKvSCQWcVcMWhmuLT+BkG06LD/N2//VgVdfNzAkEAsXIZyn+uSOiPbKDOy0rapa8ugfGPsw1VRUa8D7P7yLGjh7GgTSI+sbR5IrX83yWUVnj/HO0diAA2n/uuQ/nV2QJAeMcrGV7aQGUfbbYfgDK0XQWyi9SWMFFqNNZZ+aMNAGNRIzGhF7SFiw9BrKC/Dpv10R9KFlQXc6DV1FPStl3SxwJBAMqO48u6Ik212acKn9ODOZQhvB4nvzUc5DX00towi5hAD8GyaW9UMmPkC0i9gY+o+7vJlSo2XWKV/j0YnksiHmo=",
                signcontent);
        StringEntity entity = new StringEntity(reqmsg,"utf-8");//解决中文乱码问题
        //System.out.println("---"+entity);
        method.addHeader("Content-type","application/json; charset=utf-8");
        method.setHeader("Accept", "application/json");
        method.setHeader("username", "xwdbtest");
        method.setHeader("accesskey", "Z215c033");
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
