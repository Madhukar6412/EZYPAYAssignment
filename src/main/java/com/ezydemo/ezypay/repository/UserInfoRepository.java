package main.java.com.ezydemo.ezypay.repository;

import main.java.com.ezydemo.ezypay.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository  extends JpaRepository<UserInfo,Long> {

    UserInfo findByUserName(String username);

}
