package com.zat.coupon.service.impl;
import com.springbootside.duang.db.curd.CurdService;
import com.zat.coupon.dao.UserDao;
import com.zat.coupon.entity.User;
import com.zat.coupon.service.DemoService;
//import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl  extends CurdService<User> implements DemoService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private SQLManager manager;


    @Override
    public User save(User user) {
        userDao.unique(13);
//        userDao.createQuery()
        manager.unique(User.class, 13);
        return user;
    }


}
