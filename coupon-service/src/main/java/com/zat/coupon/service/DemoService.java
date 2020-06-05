package com.zat.coupon.service;

import com.springbootside.duang.common.dao.SqlDao;
import com.springbootside.duang.exception.nums.BaseExceptionEnum;
import com.zat.coupon.dao.UserDao;
import com.zat.coupon.entity.User;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.db.DBStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by laotang on 2020/5/17.
 */
@Service
public class DemoService {

    public String index(String value) {
        return System.currentTimeMillis() + "_" + value;
    }

//    @Autowired
//    private UserDao userDao;
    @Autowired
    private SqlDao<User> userDao;

    public User save(User user) {
//        user.setName(null);
//        java.util.Objects.requireNonNull(user.getName());
        BaseExceptionEnum.PARAM_NULL.assertNotNull(user.getName());
        userDao.save(user);

        // BeetlSQL
//        ConnectionSource source = ConnectionSourceHelper.getSimple(driver, url, "", userName, password);
//        DBStyle mysql = new MySqlStyle();
//        // sql语句放在classpagth的/sql 目录下
//        SQLLoader loader = new ClasspathLoader("/sql");
//        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，
//        // 还有一个是UnderlinedNameConversion，下划线风格的        所以采用DefaultNameConversion nc = new  所以采用DefaultNameConversion();
//        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
//        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
        return user;
    }

}
