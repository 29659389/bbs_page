package com.wusan.forum.controller;

import com.wusan.forum.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class GetSessionController {
    @RequestMapping(path = "/getSession")
    @ResponseBody
    public UserInfo getSession(HttpServletRequest request){
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        if (userInfo!=null){
            return userInfo;
        }
        return null;
    }
}
