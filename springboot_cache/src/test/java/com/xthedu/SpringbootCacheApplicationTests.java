package com.xthedu;

import com.xthedu.dao.UserDao;
import com.xthedu.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootCacheApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        User user = userDao.selectByName("aa");
        System.out.println(user);
    }

}
