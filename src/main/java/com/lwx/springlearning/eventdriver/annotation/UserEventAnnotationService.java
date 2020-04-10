package com.lwx.springlearning.eventdriver.annotation;

import com.lwx.springlearning.eventdriver.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 用户服务类-->发布用户注册相关事件源
 */
@Component
@Slf4j
public class UserEventAnnotationService {

    @Autowired
    public ApplicationEventPublisher applicationEventPublisher;


    public String userRegister(String name) {

        log.info("start to register user: " + name);


        applicationEventPublisher.publishEvent(new UserRegisterEvent(name));


        return "success";
    }
}
