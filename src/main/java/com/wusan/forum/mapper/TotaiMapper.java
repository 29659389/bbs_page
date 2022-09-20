package com.wusan.forum.mapper;

import com.wusan.forum.entity.Module;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TotaiMapper {
    public List<post> NumAll();

    public List<UserInfo> VipAll();

    public List<Module> SAll();

    public List<post> YAll();

    //帖子回复数
    public Integer Rpost(Integer pid);
}
