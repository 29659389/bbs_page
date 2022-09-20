package com.wusan.forum.mapper.show;

import com.wusan.forum.entity.show.Post;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface PostMapper {
    //查询帖子
    List<Post> findPost(String pid);
    //查询回帖
    List<Post> findReply(String pid);
    //回帖
  void addReply();


}
