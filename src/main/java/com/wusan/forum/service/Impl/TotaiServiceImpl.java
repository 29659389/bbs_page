package com.wusan.forum.service.Impl;

import com.wusan.forum.entity.Module;
import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.entity.post;
import com.wusan.forum.mapper.TotaiMapper;
import com.wusan.forum.service.TotaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TotaiServiceImpl")
public class TotaiServiceImpl implements TotaiService {
    @Autowired
    TotaiMapper mapper;
    @Override
    public List<post> NumAll() {
        return mapper.NumAll();
    }

    @Override
    public List<UserInfo> VipAll() {
        return mapper.VipAll();
    }

    @Override
    public List<Module> SAll() {
        return mapper.SAll();
    }

    @Override
    public List<post> YAll() {
        return mapper.YAll();
    }

    @Override
    public Integer Rpost(Integer pid) {
        return mapper.Rpost(pid);
    }

}
