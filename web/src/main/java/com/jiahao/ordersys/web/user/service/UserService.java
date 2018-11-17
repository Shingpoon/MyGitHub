package com.jiahao.ordersys.web.user.service;

import com.jiahao.ordersys.repo.domain.User;
import com.jiahao.ordersys.repo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getUserById(Integer id){
        return userRepository.getOne(id);
    }

}
