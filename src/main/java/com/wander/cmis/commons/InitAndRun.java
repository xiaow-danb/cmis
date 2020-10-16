package com.wander.cmis.commons;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class InitAndRun {

    public static String run(String url, String param1, String param2, String jsonstr) {
        HttpResponse result = CqjyApiTest.restreq(url, param1, param2, jsonstr);
        String resData = null;
        try {
            resData = EntityUtils.toString(result.getEntity(), "utf-8");
            return resData;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resData;
    }
}
