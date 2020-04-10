package com.lwx.springlearning.eventdriver.annotation;

import com.lwx.springlearning.eventdriver.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 日志监听服务 -->监听用户注册事件源
 * @see : {@link com.lwx.springlearning.eventdriver.event.UserRegisterEvent}
 */
@Component
@Slf4j
public class LogAnnotationListenerService implements Ordered {


    @Override
    public int getOrder() {
        return 3;
    }

    public String notifyRegister(String name) {

        log.info("start to log user: " + name);
        return "success";
    }

    @EventListener
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {

        String name = (String) userRegisterEvent.getSource();
        notifyRegister(name);
    }
}
