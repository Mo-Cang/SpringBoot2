package com.xthedu.service;

import org.springframework.stereotype.Service;

public interface UserService {
    public String get(String username);
    public boolean check(String username, String code);
}
