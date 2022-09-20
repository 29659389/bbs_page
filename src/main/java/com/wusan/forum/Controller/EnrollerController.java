package com.wusan.forum.controller;


import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.service.Impl.EnrollerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnrollerController {

    @Autowired
    EnrollerServiceImpl service;
    //添加
    @RequestMapping("addUser")
    @ResponseBody
    public Integer addUser(UserInfo userInfo){
        System.out.println(userInfo);
        return  service.addUser(userInfo);
    }

//    判断当前手机号是否注册过
    @RequestMapping("/selePhone")
    @ResponseBody
    public Integer selePhone(String phone){
        System.out.println("进入到controller");
        System.out.println(phone);
        Integer result = service.selePhone(phone);
        System.out.println(result);
        return result;
    }

}
