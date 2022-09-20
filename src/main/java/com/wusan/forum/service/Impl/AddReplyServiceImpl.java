package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.SensitiveWord;
import com.wusan.forum.mapper.AddReplyMapper;
import com.wusan.forum.service.AddReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("addReplyServiceImpl")
public class AddReplyServiceImpl implements AddReplyService {
    @Autowired
    private AddReplyMapper mapper;
    @Override
    public Integer addReply(Map map) {

        Integer result=0;
        //执行添加帖子操作
        result= mapper.addReply(map);

         //获取回复的rid编号
        String rid=getIdentity().toString();
        String pid= (String) map.get("pid");

        //将回复信息与帖子进行对应
        result= addRepluAndPost(pid,rid);

        return result;
    }

    @Override
    public Integer getIdentity() {
        return mapper.getIdentity();
    }

    @Override
    public Integer addRepluAndPost(String pid, String rid) {
        return mapper.addRepluAndPost(pid, rid);
    }
}
