package com.wusan.forum.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AddReplyMapper {
    //添加回复
    Integer addReply(Map map);

    //获取添加帖子后的主键ID
    Integer getIdentity();

    //将回复信息与帖子对应
    Integer addRepluAndPost(String pid,String rid);
}
