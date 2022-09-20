package com.wusan.forum.controller;
import com.wusan.forum.entity.*;
import com.wusan.forum.entity.Module;
import com.wusan.forum.service.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;

    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll(HttpServletRequest request) {
        List<Customer> list=service.findAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("replyAll")
    @ResponseBody
    public Map<String, Object> replyAll() {
        List<reply> list=service.replyAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("OstAll")
    @ResponseBody
    public Map<String, Object> OstAll() {
        List<post> list=service.OstAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("postAll")
    @ResponseBody
    public Map<String, Object> postAll() {
        List<post> list=service.postAll();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("replyAlls")
    @ResponseBody
    public Map<String, Object> replyAlls() {
        List<reply> list=service.replyAlls();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("postAlls")
    @ResponseBody
    public Map<String, Object> postAlls() {
        List<post> list=service.postAlls();
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("SonAll")
    @ResponseBody
    public Map<String, Object> SonAll(Integer mid) {
        List<Module> list=service.sonAll(mid);
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }

    @RequestMapping("SmAll")
    @ResponseBody
    public Map<String, Object> SmAll(String smid) {
        List<Module> list=service.SmAll(smid);
        Map<String, Object> map = new HashMap<String, Object>();map.put( "list", list);
        return map;
    }
}
