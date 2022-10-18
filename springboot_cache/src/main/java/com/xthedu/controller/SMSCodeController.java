package com.xthedu.controller;

import com.xthedu.domain.SMSCode;
import com.xthedu.service.SMSservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
public class SMSCodeController {

    @Autowired
    private SMSservice smsService;

    @GetMapping
    public String getCode(String tel) {
        return smsService.getCode(tel);
    }

    @PostMapping
    public boolean check(SMSCode smsCode) {
        return smsService.check(smsCode);
    }

}
