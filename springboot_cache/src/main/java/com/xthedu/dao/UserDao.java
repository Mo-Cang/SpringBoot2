package com.xthedu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xthedu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where username = #{username}")
    User selectByName(String username);
}
