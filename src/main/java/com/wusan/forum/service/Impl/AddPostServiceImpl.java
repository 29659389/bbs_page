package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.SensitiveWord;
import com.wusan.forum.mapper.AddPostMapper;
import com.wusan.forum.service.AddPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service("addPostServiceImpl")
public class AddPostServiceImpl implements AddPostService {
    @Autowired
    private AddPostMapper mapper;

    SensitiveWord sensitiveWord=new SensitiveWord();

    //这里进行业务处理，处理输入的文字信息，并提交
    @Override
    public Integer addPost(Map map) {
        System.out.println("到达service");
        System.out.println(map);
        Integer result=0;

        //获取controller中传入的标题名称和内容，并将其进行脱敏处理
        String addPname=sensitiveWord.endString(map.get("pname").toString());
        System.out.println(addPname);
        String addPcontent=sensitiveWord.endString(map.get("pcontent").toString());
        String ptime=map.get("ptime").toString();
        System.out.print(addPname+","+addPcontent);

        //将所有需要的信息封装到map中，便于mapper获取
        Map addMap=new HashMap();
        addMap.put("pname",addPname);
        addMap.put("pcontent",addPcontent);
        addMap.put("ptime",ptime);
        System.out.println(addMap);


        //执行插入语句，将帖子信息添加到数据库中
        System.out.println(addMap);
        result= mapper.addPost(addMap);
        System.out.println("add"+result);
        //获取添加帖子的pid，并返回
        Integer pid=mapper.getIdentity();
        System.out.println("add"+result);
        //获取发帖用户id
        Integer uid=Integer.parseInt(map.get("uid").toString());
        //将用户和帖子进行绑定
        result= addPostAndUser(uid,pid);
        System.out.println("addPostAndUser"+result);

        //获取前端传入的子版块ID
        Integer smid=Integer.parseInt(map.get("smid").toString());
        result= addPostAndSonModule(pid,smid);
        System.out.println("addPostAndSonModule"+result);

        return result;
    }

    //将帖子和用户进行绑定
    @Override
    public Integer addPostAndUser(Integer uid, Integer pid) {
        return mapper.addPostAndUser(uid, pid);
    }

    //将帖子和子版块进行绑定
    @Override
    public Integer addPostAndSonModule(Integer pid, Integer smid) {
        return mapper.addPostAndSonModule(pid,smid);
    }

}
