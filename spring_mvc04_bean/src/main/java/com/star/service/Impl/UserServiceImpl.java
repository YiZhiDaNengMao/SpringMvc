package com.star.service.Impl;

import com.star.pojo.User;
import com.star.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user save success ！");
    }
}
