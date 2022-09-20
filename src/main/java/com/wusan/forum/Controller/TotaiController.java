package com.wusan.forum.controller;

import com.wusan.forum.entity.Module;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import com.wusan.forum.service.Impl.TotaiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class TotaiController {
    @Autowired
    TotaiServiceImpl service;

    @RequestMapping("NumAll")
    @ResponseBody
    public Map<String, Object> NumAll() {
        List<post> list=service.NumAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("VipAll")
    @ResponseBody
    public Map<String, Object> VipAll() {
        List<UserInfo> list=service.VipAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("SAll")
    @ResponseBody
    public Map<String, Object> SAll() {
        List<Module> list=service.SAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("YAll")
    @ResponseBody
    public Map<String, Object> YAll() {
        List<post> list=service.YAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    //回帖数
    @RequestMapping("/Rpost")
    @ResponseBody
    public Integer HpostAll(Integer pid) {
        System.out.println(pid);
        return service.Rpost(pid);
    }
}
