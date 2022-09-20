package com.wusan.forum.mapper;

import com.wusan.forum.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    UserInfo adminLogin(String uname);
}

