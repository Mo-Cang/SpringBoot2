package com.xthedu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableField("id")
    private int id;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
}
