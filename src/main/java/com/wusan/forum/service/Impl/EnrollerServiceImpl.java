package com.wusan.forum.service.Impl;


import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.mapper.EnrollerMapper;
import com.wusan.forum.service.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EnrollerServiceImpl")
public class EnrollerServiceImpl implements EnrollService {
    @Autowired
    EnrollerMapper mapper;
    @Override
    public Integer addUser(UserInfo userInfo) {
        return mapper.addUser(userInfo);
    }

    @Override
    public Integer selePhone(String phone) {
        return mapper.selePhone(phone);
    }
}
