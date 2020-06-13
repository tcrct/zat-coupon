package com.zat.coupon.service.impl;
import com.springbootside.duang.common.base.CurdService;
import com.zat.coupon.entity.User;
import com.zat.coupon.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl extends CurdService<User> implements IDemoService {

    public void aa(User user) {
        System.out.println(user);
    }
}
