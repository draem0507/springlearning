package com.lwx.springlearning.eventdriver.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 用户服务类-->发布用户注册相关事件源
 */
@Component
@Slf4j
public class UserEventService implements ApplicationEventPublisherAware {


    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

        this.applicationEventPublisher = applicationEventPublisher;

    }

    public String userRegister(String name) {

        log.info("start to register user: " + name);


        applicationEventPublisher.publishEvent(new UserRegisterEvent(name));


        return "success";
    }
}
