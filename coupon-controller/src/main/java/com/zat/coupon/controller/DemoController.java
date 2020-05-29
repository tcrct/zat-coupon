package com.zat.coupon.controller;

import com.zat.coupon.entity.User;
import com.zat.coupon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by laotang on 2020/5/17.
 */
@RestController
@RequestMapping("/demo")
@Validated
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/index")
    public String index() {
        return demoService.index("Hello Laotang!");
    }

    @RequestMapping(value = "/save", method= RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String save(@Validated @RequestBody User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                System.out.println("##############: " + fieldError.getField()+"         "+ fieldError.getDefaultMessage());
            }
            return "fail";
        }
        return demoService.index("save success!");
    }

    @RequestMapping(value = "/save1", method= RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String save1(@Validated @RequestBody User user) {
        System.out.println("####################");
        user.setName(null);
        java.util.Objects.requireNonNull(user.getName());
        User user1 =  demoService.save(user);
        return user1.getName();
    }
}
