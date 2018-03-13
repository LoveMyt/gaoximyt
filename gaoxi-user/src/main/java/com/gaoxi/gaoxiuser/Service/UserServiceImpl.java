package com.gaoxi.gaoxiuser.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;
import com.gaoxi.gaoxicommonservicefacade.vo.LoginReq;
import com.gaoxi.gaoxicommonservicefacade.vo.UserEntity;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity login(LoginReq loginReq) {
        // todo
        System.out.println("service 服务 start");
        if (loginReq.getName().equals("zhangsan")){
            UserEntity userEntity = new UserEntity();
            userEntity.setName("zhangsan");
            userEntity.setSex("男");
            return userEntity;
        }
        return null;
    }
}
