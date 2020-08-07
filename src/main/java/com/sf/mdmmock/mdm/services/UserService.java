package com.sf.mdmmock.mdm.services;

import com.sf.mdmmock.mdm.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String login(User user){
       User blacklistedUser = new User("blacklisted@yopmail.com", "test123");
       User nonExistentUser = new User("nonExistentUser@yopmail.com", "test123");

       String message = "Log in successful";

       if (user.getEmail().equalsIgnoreCase(blacklistedUser.getEmail())){
           message = "User device is blacklisted";
       } else if (user.getEmail().equalsIgnoreCase(nonExistentUser.getEmail())){
           message = "No user found with email " + user.getEmail();
       } else {
           message = "Log in successful";
       }
       return message;
    }

}
