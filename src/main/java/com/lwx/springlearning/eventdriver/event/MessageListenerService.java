package com.lwx.springlearning.eventdriver.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 消息监听服务 -->监听用户注册事件源
 * @see : {@link UserRegisterEvent}
 */
@Component
@Slf4j
public class MessageListenerService implements ApplicationListener<UserRegisterEvent> {


    public String notifyRegister(String name) {

        log.info("start to notify user: " + name);
        return "success";
    }

    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {

        String name = (String) userRegisterEvent.getSource();
        notifyRegister(name);
    }
}
