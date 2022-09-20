package com.wusan.forum.mapper;

import com.wusan.forum.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnrollerMapper {
    //注册
    public Integer addUser(UserInfo userInfo);
    public Integer selePhone(String phone);

}
