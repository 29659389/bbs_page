package com.wusan.forum.service.Impl.show;

import com.wusan.forum.entity.show.Post;
import com.wusan.forum.mapper.show.PostMapper;
import com.wusan.forum.service.show.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    @Autowired
    public PostMapper postMapper;
    //查询帖子
@Override
public List<Post> findPost(String pid) {
    System.out.println(pid);
    System.out.println(postMapper.findPost(pid));
    return postMapper.findPost(pid);
}


    @Override
    public List<Post> findReply(String pid) {
        return postMapper.findReply(pid);
    }

    @Override
    public void addReply(Post post) {
        postMapper.addReply();
    }


}
