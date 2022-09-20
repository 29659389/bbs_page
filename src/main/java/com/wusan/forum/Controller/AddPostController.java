package com.wusan.forum.controller;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.service.Impl.AddPostServiceImpl;
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
public class AddPostController {
    @Autowired
    private AddPostServiceImpl service;
    @RequestMapping(path = "/addPost")
    @ResponseBody
    public Integer addPost(String pname, String pcontent, String smid, HttpServletRequest request){
        System.out.println("到大controller");
        //从session中获取uid，将其与发布的帖子进行绑定
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        //创建map将所需要的所有信息放到map中
        Map map=new HashMap();
        //获取当前时间
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ptime=df.format(new Date());
        //将帖子内容添加到数据库中，并返回当前添加数据的主键pid
        map.put("pname",pname);
        map.put("pcontent",pcontent);
        map.put("ptime",ptime);
        map.put("smid",smid);
        map.put("uid",uid);

        Integer pid=service.addPost(map);

        return pid;
    }
}
