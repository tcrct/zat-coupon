package com.zat.coupon.service;


import com.zat.coupon.dao.UserDao;
import com.zat.coupon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Created by laotang on 2020/5/17.
 */
public interface DemoService {

//    User save(User user);

    User findById2(Integer id);

//    @Autowired
//    private UserDao userDao;
//    @Autowired
//    private Dao<User> userDao;

//    public User save(User user) {
////        user.setName(null);
////        java.util.Objects.requireNonNull(user.getName());
//        ExceptionEnum.PARAM_NULL.assertNotNull(user.getName());
////        userDao.save(user);
////        User user1 = userDao.findById("13");
//        System.out.println(userDao.getEntityClass());
//        User user1 = userDao.unique(13);
//        System.out.println(ToolsKit.toJsonString(user1));
////        userDao.findByQuery(Query )
//
//        // BeetlSQL
////        ConnectionSource source = ConnectionSourceHelper.getSimple(driver, url, "", userName, password);
////        DBStyle mysql = new MySqlStyle();
////        // sql语句放在classpagth的/sql 目录下
////        SQLLoader loader = new ClasspathLoader("/sql");
////        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，
////        // 还有一个是UnderlinedNameConversion，下划线风格的        所以采用DefaultNameConversion nc = new  所以采用DefaultNameConversion();
////        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
////        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
//        return user;
//    }

}
