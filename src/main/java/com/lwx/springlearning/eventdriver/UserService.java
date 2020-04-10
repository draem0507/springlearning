package com.lwx.springlearning.eventdriver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: liuwenxin03
 * @date: 2020/4/9 5:27 下午
 * @desc: 用户服务
 */
@Service
@Slf4j
public class UserService {


    public String userRegister(String name) {

        log.info("start to register user: " + name);
        return "success";
    }
}
