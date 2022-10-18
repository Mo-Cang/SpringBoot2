package com.xthedu.controller;

import com.xthedu.dao.UserDao;
import com.xthedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public String get(@PathVariable String username) {
        return userService.get(username);
    }

    @PostMapping
    public boolean check(String username, String code) {
        return userService.check(username, code);
    }
}
