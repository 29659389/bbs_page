package com.wusan.forum.service.show;

import com.wusan.forum.entity.show.Post;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostService {
 //查询帖子
   List<Post> findPost(String pid);
   //查询回帖
    List<Post> findReply(String pid);
    //回帖
    void addReply(Post post);

}
