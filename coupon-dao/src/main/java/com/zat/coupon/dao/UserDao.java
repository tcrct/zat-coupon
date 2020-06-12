package com.zat.coupon.dao;

import com.springbootside.duang.db.dao.Dao;
import com.springbootside.duang.db.dao.template.beetlsql.BeetlDaoTemplate;
import com.zat.coupon.entity.User;

import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 *  UserDao
 *
 * @author Laotang
 * @since 1.0
 */
//@Component
public interface UserDao extends Dao<User> {

}
