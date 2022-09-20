package com.wusan.forum.service;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("UserService")
public interface UserService {
    public UserInfo UserAll(Integer uid);
    Integer UpdateRealState(Map map);
    Integer addRealState(Map map);
    //修改地址
    public Integer updateUser(UserInfo userInfo);
    //修改地址
    public Integer updateEmail(UserInfo userInfo);
    Integer upUicon(String uid,String uicon);
    //发帖数
    public Integer FpostAll(Integer uid);
    //回帖数
    public Integer HpostAll(Integer uid);
    //我的帖子
    public List<post> Mepost(Integer uid);
    //修改
    public Integer Mepostup(Map map);
    //删除
    public Integer MepostDe(Map map);
    public Integer upName(Map map);
}
