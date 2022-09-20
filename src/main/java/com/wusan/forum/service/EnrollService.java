package com.wusan.forum.service;

import com.wusan.forum.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface EnrollService {
    //注册
    public Integer addUser(UserInfo userInfo);
    public Integer selePhone(String phone);
}
