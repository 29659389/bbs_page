package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.mapper.LoginMapper;
import com.wusan.forum.service.LoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper mapper;
    @Override
    public UserInfo adminLogin(String uname) {
        return mapper.adminLogin(uname);
    }
}
