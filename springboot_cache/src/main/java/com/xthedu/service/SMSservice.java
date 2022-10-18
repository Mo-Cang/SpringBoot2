package com.xthedu.service;

import com.xthedu.domain.SMSCode;

public interface SMSservice {
    public String getCode(String tel);
    public boolean check(SMSCode smsCode);
}
