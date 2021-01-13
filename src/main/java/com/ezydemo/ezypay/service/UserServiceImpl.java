package  main.java.com.ezydemo.ezypay.service;
import main.java.com.ezydemo.ezypay.model.*;
import main.java.com.ezydemo.ezypay.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public void save(UserInfo userInfo) {
      userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
      userInfo.setRoles(new HashSet<>(roleRepository.findAll()));
      userInfoRepository.save(userInfo);
         }
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUserName(username);
    }
}
