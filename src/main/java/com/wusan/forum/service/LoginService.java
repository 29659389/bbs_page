package com.wusan.forum.service;

import com.wusan.forum.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    UserInfo adminLogin(String uname);
}
