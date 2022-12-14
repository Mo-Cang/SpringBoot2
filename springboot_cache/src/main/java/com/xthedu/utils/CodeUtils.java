package com.xthedu.utils;

import com.xthedu.domain.SMSCode;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {

    private String[] patch = {"000000","00000","0000","000","00","0",""};

    public String generator(String tel){
        int hash = tel.hashCode();
        int encryption = 20208888;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        return patch[len] + codeStr;
    }

    @Cacheable(value = "smsCode",key = "#tel")
    public String get(String tel){
        return null;
    }

}
