package com.wusan.forum.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AddReplyService {
    Integer addReply(Map map);
    //获取添加帖子后的主键ID
    Integer getIdentity();

    //将回复信息与帖子对应
    Integer addRepluAndPost(String pid,String rid);
}
