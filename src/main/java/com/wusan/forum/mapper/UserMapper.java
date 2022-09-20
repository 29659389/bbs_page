package com.wusan.forum.mapper;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    public UserInfo UserAll(Integer uid);
    Integer UpdateRealState(String uid);
    Integer addRealState(Map map);
    //修改地址
    public Integer updateUser(UserInfo userInfo);
    //修改地址
    public Integer updateEmail(UserInfo userInfo);
    Integer upUicon(String uid,String uicon);

    //用户发帖数
    public Integer FpostAll(Integer uid);
    //用户回帖数
    public Integer HpostAll(Integer uid);

    //我的帖子
    public List<post> Mepost(Integer uid);
    //修改
    public Integer Mepostup(Map map);
    //删除
    public Integer MepostDe(Map map);
//    修改名称
    public Integer upName(Map map);


}
