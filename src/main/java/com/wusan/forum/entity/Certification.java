package com.wusan.forum.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class Certification {


    //提供对外的接口
    public  Integer certification(Map map)  {
        Map<String, String> params = new HashMap<>();
        params.put("idcard", map.get("uIDcard").toString());
        params.put("name", map.get("name").toString());
        String result = null;
        try {
            result = postForm(params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject= JSON.parseObject(result);
        JSONObject represult= (JSONObject) jsonObject.get("result");
        String res= (String)represult.get("res");
        System.out.println(res);
        Integer a=Integer.parseInt(res);
        return a;
    }

    /**
     * 用到的HTTP工具包：okhttp 3.13.1
     * <dependency>
     * <groupId>com.squareup.okhttp3</groupId>
     * <artifactId>okhttp</artifactId>
     * <version>3.13.1</version>
     * </dependency>
     */

    //提供验证接口，使用map将姓名身份证号信息进行验证，并返回响应结果
    public static String postForm(   Map<String, String> params) throws IOException {
        String url = "https://eid.shumaidata.com/eid/check";
        String appCode = "a86fb424ea2c4636a7f3c7f92e7268d0";
        OkHttpClient client = new OkHttpClient.Builder().build();
        FormBody.Builder formbuilder = new FormBody.Builder();
        Iterator<String> it = params.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            formbuilder.add(key, params.get(key));
        }
        FormBody body = formbuilder.build();
        Request request = new Request.Builder().url(url).addHeader("Authorization", "APPCODE " + appCode).post(body).build();
        Response response = client.newCall(request).execute();
        System.out.println("返回状态码" + response.code() + ",message:" + response.message());
        String result = response.body().string();
        System.out.println(result);
        return result;
    }
}