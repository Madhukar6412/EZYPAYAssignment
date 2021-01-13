package main.java.com.ezydemo.ezypay.service;

public interface SecurityService {

     String findLoggedInUsername();
    void autologin(String username, String password);
}

