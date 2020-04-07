package com.yex.pro.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yexuan on 2020/4/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getById")
    public String getUserById(){
        return "/user/profile";
    }
}
