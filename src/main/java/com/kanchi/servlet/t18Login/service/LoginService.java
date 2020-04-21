package com.kanchi.servlet.t18Login.service;

import com.kanchi.servlet.t18Login.dto.User;

import java.util.HashMap;

public class LoginService {

    HashMap<String,String> users = new HashMap<String,String>();

    public LoginService(){
        users.put("johndoe","Jhon Doe");
        users.put("janedoe","Jane Doe");
        users.put("jguru","Java Guru");
    }
    public boolean authenticate (String userId,String password){
        if(password==null || password.trim() == ""){
            return false;
        }
        return true;
    }

    public User getUserDetails(String userID){
        User user =new User();
        user.setUserName(users.get(userID));
        user.setUserId(userID);
        return user;
    }
}
