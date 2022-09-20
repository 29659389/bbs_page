package com.wusan.forum.mapper;


import com.wusan.forum.entity.*;
import com.wusan.forum.entity.Module;
import com.wusan.forum.service.UserService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    public List<Customer> findAll();

    public List<reply> replyAll();

    public List<post> OstAll();

    public List<post> postAll();

    public List<reply> replyAlls();

    public List<post> postAlls();

    public List<Module> sonAll(Integer mid);

    public List<Module> SmAll(String smid);

}
