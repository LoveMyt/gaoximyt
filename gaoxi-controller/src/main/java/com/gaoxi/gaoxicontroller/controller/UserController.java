package com.gaoxi.gaoxicontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;
import com.gaoxi.gaoxicommonservicefacade.vo.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.vo.Result;
import com.gaoxi.gaoxicommonservicefacade.vo.UserEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    public Result login(LoginReq loginReq, HttpServletResponse response){
        UserEntity login = userService.login(loginReq);
        System.out.println("controller 请求服务");
        return null;
    }

}
