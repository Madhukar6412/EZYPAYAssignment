package main.java.com.ezydemo.ezypay.service;
import main.java.com.ezydemo.ezypay.model.*;

public interface UserService {

    void save(UserInfo userInfo);
    UserInfo findByUsername(String username);
}
