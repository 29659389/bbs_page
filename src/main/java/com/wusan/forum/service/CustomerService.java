package com.wusan.forum.service;

import com.wusan.forum.entity.*;
import com.wusan.forum.entity.Module;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public List<Customer> findAll();

    public List<reply> replyAll();

    public List<post> OstAll();

    public List<post> postAll();

    public List<reply> replyAlls();

    public List<post> postAlls();

    public List<Module> sonAll(Integer mid);

    public List<Module> SmAll(String smid);

}
