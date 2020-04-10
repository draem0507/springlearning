package com.lwx.springlearning.eventdriver;

import com.lwx.springlearning.eventdriver.annotation.UserEventAnnotationService;
import com.lwx.springlearning.eventdriver.event.UserEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: liuwenxin
 * @date: 2020/4/9 5:26 下午
 * @desc: 用户注册控制器
 */
@RestController()
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @Resource
    private MessageService messageService;
    @Resource
    private UserEventService userEventService;
    @Resource
    private UserEventAnnotationService userEventAnnotationService;


    @GetMapping("/register")
    public String register(String name) {

        userService.userRegister(name);

        messageService.notifyRegister(name);

        return "success";

    }


    @GetMapping("/register_event")
    public String register_event(String name) {

        userEventService.userRegister(name);

        return "success";

    }


    @GetMapping("/register_event_annotation")
    public String register_event_annotation(String name) {

        userEventAnnotationService.userRegister(name);

        return "success";

    }
}
