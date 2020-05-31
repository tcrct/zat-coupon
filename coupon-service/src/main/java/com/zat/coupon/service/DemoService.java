package com.zat.coupon.service;

import com.springbootside.duang.exception.nums.BaseExceptionEnum;
import com.zat.coupon.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by laotang on 2020/5/17.
 */
@Service
public class DemoService {

    public String index(String value) {
        return System.currentTimeMillis() + "_" + value;
    }

    public User save(User user) {
        user.setName(null);
//        java.util.Objects.requireNonNull(user.getName());
        BaseExceptionEnum.PARAM_NULL.assertNotNull(user.getName());
        return user;
    }

}
