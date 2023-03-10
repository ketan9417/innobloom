package com.niit.UserAuthenticationService.service;


import com.niit.UserAuthenticationService.model.User;


import java.util.Map;

public interface SecurityTokenGenerator {

    Map<String,String> generateToken(User user);
}
