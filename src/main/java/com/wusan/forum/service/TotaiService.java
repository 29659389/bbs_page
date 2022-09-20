package com.wusan.forum.service;

import com.wusan.forum.entity.Module;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TotaiService")
public interface TotaiService {
    public List<post> NumAll();

    public List<UserInfo> VipAll();

    public List<Module> SAll();

    public List<post> YAll();

    //帖子回复数
    public Integer Rpost(Integer pid);

}
