package com.wusan.forum.controller;

import com.wusan.forum.entity.SensitiveWord;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.service.Impl.AddReplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AddReplyController {
    @Autowired
    private AddReplyServiceImpl service;

    @RequestMapping(path = "/addReply")
    @ResponseBody
    public Integer addReply(String pid, String rcontent, HttpServletRequest request){
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        Integer uid=userInfo.getUid();

        //获取当前时间
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rtime=df.format(new Date());
        SensitiveWord sensitiveWord=new SensitiveWord();
        rcontent=sensitiveWord.endString(rcontent);
        Map map=new HashMap();
        map.put("uid",uid);
        map.put("pid",pid);
        map.put("rcontent",rcontent);
        map.put("rtime",rtime);
        Integer result= service.addReply(map);
        return result;
    }
}
