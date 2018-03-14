package com.gaoxi.service;

import com.gaoxi.vo.LoginReq;
import com.gaoxi.vo.UserEntity;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
