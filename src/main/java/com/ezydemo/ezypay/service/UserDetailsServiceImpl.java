package main.java.com.ezydemo.ezypay.service;

import main.java.com.ezydemo.ezypay.model.*;
import main.java.com.ezydemo.ezypay.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashSet;
import java.util.Set;

public class UserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    public UserInfoRepository userInfoRepository;

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        UserInfo userInfo = userInfoRepository.findByUserName(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : userInfo.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(userInfo.getUsername(),userInfo.getPassword(),grantedAuthorities);
    }
}

