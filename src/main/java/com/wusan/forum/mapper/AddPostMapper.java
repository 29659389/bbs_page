package com.wusan.forum.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AddPostMapper {
    //添加帖子
    Integer addPost(Map map);
    //获取添加帖子后的主键ID
    Integer getIdentity();
    //将帖子和用户进行绑定
    Integer addPostAndUser(Integer uid,Integer pid);
    //将帖子和子版块进行绑定
    Integer addPostAndSonModule(Integer pid,Integer smid);
}
