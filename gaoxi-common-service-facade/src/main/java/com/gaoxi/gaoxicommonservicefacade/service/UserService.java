package com.gaoxi.gaoxicommonservicefacade.service;

import com.gaoxi.gaoxicommonservicefacade.vo.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.vo.UserEntity;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
