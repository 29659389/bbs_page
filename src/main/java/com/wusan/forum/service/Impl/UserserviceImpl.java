package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import com.wusan.forum.mapper.UserMapper;
import com.wusan.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("UserserviceImpl")
public class UserserviceImpl implements UserService {
    @Autowired
     public UserMapper mapper;

    @Override
    public UserInfo UserAll(Integer uid) {
        return mapper.UserAll(uid);
    }

    @Override
    public Integer UpdateRealState(Map map) {
        String uid=map.get("uid").toString();
        Integer result= mapper.UpdateRealState(uid);
        if (result==1){
           result=  addRealState(map);
        }
        return result;
    }

    @Override
    public Integer addRealState(Map map) {
        return mapper.addRealState(map);
    }

    @Override
    public Integer updateUser(UserInfo userInfo) {
        return mapper.updateUser(userInfo);
    }

    @Override
    public Integer updateEmail(UserInfo userInfo) {
        return mapper.updateEmail(userInfo);
    }

    @Override
    public Integer upUicon(String uid, String uicon) {
        System.out.println(uid+" "+uicon);
        return mapper.upUicon(uid, uicon);
    }

    @Override
    public Integer FpostAll(Integer uid) {
        return mapper.FpostAll(uid);
    }

    @Override
    public Integer HpostAll(Integer uid) {
        return mapper.HpostAll(uid);
    }
    @Override
    public List<post> Mepost(Integer uid) {
        return mapper.Mepost(uid);
    }

    @Override
    public Integer Mepostup(Map map) {
        return mapper.Mepostup(map);
    }

    @Override
    public Integer MepostDe(Map map) {
        return mapper.MepostDe(map);
    }

    @Override
    public Integer upName(Map map) {
        return mapper.upName(map);
    }
}
