package com.lwx.springlearning.eventdriver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:27 下午
 * @desc: 消息服务
 */
@Service
@Slf4j
public class MessageService {


    public String notifyRegister(String name) {

        log.info("start to notify user: " + name);
        return "success";
    }
}
