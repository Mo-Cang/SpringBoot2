package com.xthedu.service.impl;

import com.xthedu.domain.SMSCode;
import com.xthedu.service.SMSservice;
import com.xthedu.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SMSserviceimpl implements SMSservice {

    @Autowired
    private CodeUtils codeUtils;

    @Override
//    @Cacheable(value = "SMSCode",key = "#tel")
    @CachePut(value = "smsCode",key = "#tel")
    public String getCode(String tel) {
        String code = codeUtils.generator(tel);
        return code;
    }

    @Override
    public boolean check(SMSCode smsCode) {
        String code = smsCode.getCode();
        String cacheCode = codeUtils.get(smsCode.getTel());
        return code.equals(cacheCode);
    }
}
