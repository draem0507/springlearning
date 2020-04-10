package com.lwx.springlearning.eventdriver.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 日志监听服务 -->监听用户注册事件源
 * @see : {@link UserRegisterEvent}
 */
@Component
@Slf4j
public class LogListenerService implements ApplicationListener<UserRegisterEvent>, Ordered {


    @Override
    public int getOrder() {
        return 3;
    }

    public String notifyRegister(String name) {

        log.info("start to log user: " + name);
        return "success";
    }

    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {

        String name = (String) userRegisterEvent.getSource();
        notifyRegister(name);
    }
}
