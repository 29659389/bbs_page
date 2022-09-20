package com.wusan.forum.controller;

import com.github.pagehelper.PageInfo;
import com.wusan.forum.entity.Certification;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import com.wusan.forum.service.Impl.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    public UserserviceImpl userservice;
    @Autowired
    private Certification certification;

    @RequestMapping("/UserAll")
    @ResponseBody
    //通过session中的uid进行查询获取用户信息，返回给前端显示
    public UserInfo UserAll(HttpSession httpSession){
        UserInfo  userInfo= (UserInfo) httpSession.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        return userservice.UserAll(uid);
    }

    //发帖数
    @RequestMapping("/FpostAll")
    @ResponseBody
    public Integer FpostAll(HttpSession httpSession) {
        UserInfo  userInfo= (UserInfo) httpSession.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        System.out.println(uid);
        return userservice.FpostAll(uid);
    }

    //回帖数
    @RequestMapping("/HpostAll")
    @ResponseBody
    public Integer HpostAll(HttpSession httpSession) {
        UserInfo  userInfo= (UserInfo) httpSession.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        System.out.println(uid);
        return userservice.HpostAll(uid);
    }

    //修改地址
    @RequestMapping("/updateUser")
    @ResponseBody
    public Integer updateUser(UserInfo userInfo){
        System.out.println(userInfo);
        return userservice.updateUser(userInfo);
    }

    //修改邮箱
    @RequestMapping("/updateEmail")
    @ResponseBody
    public Integer updateEmail(UserInfo userInfo){
        System.out.println(userInfo);
        return userservice.updateEmail(userInfo);
    }


    @RequestMapping(path = "/Certification")
    @ResponseBody
    public Integer Certification(String name, String uIDcard, HttpServletRequest request){

        //从session中获取uid
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        Integer uid=userInfo.getUid();

        //System.out.println(name+"  "+idcard);
        Map map=new HashMap();
        map.put("uid",uid);
        map.put("name",name);
        map.put("uIDcard",uIDcard);
        Integer resultcrt=certification.certification(map);
        Integer result=0;
        String msg="";
        //判断实名接口返回数据1为成功，其余为失败
        if (resultcrt==1){
            result= userservice.UpdateRealState(map);
            if (result==1){
                msg="认证成功";
                return 1;
            }else{
                msg="认证失败";
                return 0;
            }

        }

        return 0;
    }

    //我的帖子
    @RequestMapping("/Mepost")
    @ResponseBody
    public Map<String, Object> Mepost(HttpSession httpSession,@RequestParam(required = false, defaultValue = "1") int page,
                                      @RequestParam(required = false) int limit) {
        UserInfo  userInfo= (UserInfo) httpSession.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        List<post> school = userservice.Mepost(uid);// 这是我们的sql
        System.out.println("asdfas"+uid);
        // 使用pageInfo包装查询
        PageInfo<post> rolePageInfo = new PageInfo<>(school);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", rolePageInfo.getTotal());
        map.put("data", rolePageInfo.getList());
        return map;
    }

    @RequestMapping("/Mepostup")
    @ResponseBody
    public Integer Mepostup(post post, @RequestParam("pid") Integer pid) {
        Map<String, Object> map = new HashMap<>();
        map.put("post", post);
        map.put("pid", pid);
        System.out.println(map);
        return userservice.Mepostup(map);
    }

    @RequestMapping("/MepostDe")
    @ResponseBody
    public Integer MepostDe(post post, @RequestParam("pid") Integer pid) {
        Map<String, Object> map = new HashMap<>();
        map.put("post", post);
        map.put("pid", pid);
        System.out.println(map);
        return userservice.MepostDe(map);
    }

    @RequestMapping("/upName")
    @ResponseBody
    public Integer upName(String newname,HttpServletRequest request){
        System.out.println(123456);
        //从session中获取uid
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        Integer uid=userInfo.getUid();
        //获取需要修改的名称
//        System.out.println(newname);
        Map map =new HashMap();
        map.put("uid",uid);
        map.put("newName",newname);
        System.out.println(map);
        Integer result = userservice.upName(map);
//        System.out.println();
        return result;
    }
}
