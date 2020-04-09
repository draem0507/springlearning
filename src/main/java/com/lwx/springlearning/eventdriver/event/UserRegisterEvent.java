package com.lwx.springlearning.eventdriver.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 6:01 下午
 * @desc: 用户注册事件源
 */
public class UserRegisterEvent extends ApplicationEvent {


    public UserRegisterEvent(Object source) {
        super(source);
    }
}
