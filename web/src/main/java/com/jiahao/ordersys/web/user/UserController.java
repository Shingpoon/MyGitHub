package com.jiahao.ordersys.web.user;

import com.jiahao.ordersys.common.BaseController;
import com.jiahao.ordersys.web.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity getUser(@PathVariable String userId){
        return ResponseEntity.ok(null);
    }
}
