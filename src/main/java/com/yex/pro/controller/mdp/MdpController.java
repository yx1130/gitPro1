package com.yex.pro.controller.mdp;

import com.yex.pro.util.TokenUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 针对mdp专用
 * Created by yexuan on 2020/3/9.
 */
@Controller
@RequestMapping("/mdp")
public class MdpController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("jump")
    public String jump(Map<String,Object> map, @RequestParam("token1") String token){
        if(!"".equals(token)){
            token = TokenUtils.decode(token);
        }
        map.put("msg",token);
        return "/mdp/jumpTo";
    }
}
