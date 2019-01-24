package com.kasthuri.authentication.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

@RestController
@CrossOrigin
public class UserController {

//    @RequestMapping("/login")
//    public boolean login(@RequestBody User user) {
//        return
//                user.getUsername().equals("user") && user.getPassword().equals("password");
//    }
//
//    @RequestMapping("/user")
//    public Principal user(HttpServletRequest request) {
//        String authToken = request.getHeader("Authorization")
//                .substring("Basic".length()).trim();
//        return () -> new String(Base64.getDecoder()
//                .decode(authToken)).split(":")[0];
//    }

    @CrossOrigin
    @GetMapping("api/auth/v1/user")
    public Principal user(Principal user) {
        return user;
    }


}
