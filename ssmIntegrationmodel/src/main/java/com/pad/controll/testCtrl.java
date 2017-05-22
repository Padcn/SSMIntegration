package com.pad.controll;

import com.pad.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by pad on 17-5-21.
 */
@Controller
public class testCtrl {
    @Resource
    TestService testService;

    @RequestMapping("/test")
    public String test1(){
        System.out.println(testService.test());
        return "test";
    }
}
