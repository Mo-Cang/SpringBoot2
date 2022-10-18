package com.xthedu.service.impl;

import com.xthedu.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceimpl implements UserService {

    private HashMap<String,String> cache = new HashMap<String,String>();

    @Override
    public String get(String username) {
        String code = username.substring(username.length()-6);
        cache.put(username,code);
        return code;
    }

    @Override
    public boolean check(String username, String code) {
        String queryCode = cache.get(username);
        return code.equals(queryCode);
    }
}
