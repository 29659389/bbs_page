package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.*;
import com.wusan.forum.entity.Module;
import com.wusan.forum.mapper.CustomerMapper;
import com.wusan.forum.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;
    @Override
    public List<Customer> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<reply> replyAll() {
        return mapper.replyAll();
    }

    @Override
    public List<post> OstAll() {
        return mapper.OstAll();
    }

    @Override
    public List<post> postAll() {
        return  mapper.postAll();
    }

    @Override
    public List<reply> replyAlls() {
        return mapper.replyAlls();
    }


    @Override
    public List<post> postAlls() {
        return  mapper.postAlls();
    }

    @Override
    public List<Module> sonAll(Integer mid) {
        return mapper.sonAll(mid);
    }

    @Override
    public List<Module> SmAll(String smid) {
        return mapper.SmAll(smid);
    }



}
