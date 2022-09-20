package com.wusan.forum.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AddPostService {
    Integer addPost(Map map);
    Integer addPostAndUser(Integer uid,Integer pid);
    Integer addPostAndSonModule(Integer pid,Integer smid);
}
