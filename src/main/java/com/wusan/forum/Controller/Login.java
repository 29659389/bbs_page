package com.wusan.forum.controller;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.service.Impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class Login {
    @Autowired
    private LoginServiceImpl service;

    //登陆成功后跳转到的页面
        @RequestMapping(path = "/adminlogin")
    public String homepage(HttpServletRequest request,String username,String password,Model model){
            String str=username+password;
            System.out.println(str);
            UserInfo adminInfo=  service.adminLogin(username);
            System.out.println(adminInfo);
            if (adminInfo==null){
                model.addAttribute("meg","账号或密码错误，请重试");
                return "login.html";
            }
            if (adminInfo.getState()==1){
                model.addAttribute("meg","账号被禁用，请联系管理员");
                return "login.html";
            }
            String pwd=adminInfo.getUpwd();
            HttpSession session=request.getSession();
            if (pwd.equals(password)){
                session.setAttribute("userInfo",adminInfo);
                return "Customer.html";
            }else{
                model.addAttribute("meg","账号或密码错误，请重试");
                return "login.html";
            }

            //return "login.html";
        /*//获取登陆名，查询其相对应的数据，将其放到session中
        Principal principal = request.getUserPrincipal();
        String uphone=principal.getName();
        UserInfo adminInfo=  service.adminLogin(uphone);
        //System.out.println("login"+adminInfo);
        //将获取到的内容放到session中
        HttpSession session=request.getSession();
        session.setAttribute("userInfo",adminInfo);
        //System.out.println(adminInfo.toString());*/

    }

    @RequestMapping(path = "/index")
    public String gotoIndex(){
        return "Customer";
    }

    //设置登陆失败跳转地址
    @RequestMapping(path = "/loginError")
    public String loginError(Model model){
        //通过model获取错误信息，将信息传到前段页面
        model.addAttribute("meg","账号或密码错误，请重试");
        return "login";
    }
}
