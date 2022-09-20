package com.wusan.forum.service;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo adminInfo=loginMapper.adminLogin(username);
        if (adminInfo==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        List<GrantedAuthority> authorities= AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new User(adminInfo.getUphone(),new BCryptPasswordEncoder().encode(adminInfo.getUpwd()),authorities);
    }
}
