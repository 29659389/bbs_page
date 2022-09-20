package com.wusan.forum.util;

import java.util.HashMap;
import java.util.Map;
//分页
public class RespBean {
    private long code;
    private String message;
    private Object obj;

    public RespBean() {
    }

    public RespBean(long code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "RespBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", obj=" + obj +
                '}';
    }

    public static RespBean success(String message) {
        return new RespBean(200, message, null);
    }

    public static RespBean error(String message) {
        return new RespBean(300, message, null);
    }

    public static RespBean error(String message, Object obj) {
        return new RespBean(300, message, obj);
    }

    public static Map<String, Object> layui(Object getTotal, Object getRecords) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", getTotal);
        map.put("data", getRecords);
        return map;
    }
}
