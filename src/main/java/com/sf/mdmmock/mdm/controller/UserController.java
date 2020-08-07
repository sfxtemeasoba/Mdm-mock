package com.sf.mdmmock.mdm.controller;


import com.sf.mdmmock.mdm.exception.ResourceNotFoundException;
import com.sf.mdmmock.mdm.model.User;
import com.sf.mdmmock.mdm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@Controller
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, Object> login(@Valid @RequestBody User user) throws ResourceNotFoundException {
        String message = userService.login(user);

        Map<String, Object> response = new HashMap<>();
        response.put("message", message);

        if (message.equals("Log in successful")){
            return response;
        } else {
            throw new ResourceNotFoundException(message);
        }
    }
}
