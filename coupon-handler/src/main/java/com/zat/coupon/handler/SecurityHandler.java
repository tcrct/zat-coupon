package com.zat.coupon.handler;

import com.springbootside.duang.common.annotation.Handler;
import com.springbootside.duang.common.handler.IHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求安全验证拦截处理器
 * 返回true时，调用下一个拦截处理器
 * 返回false或抛出异常时，则中断流程
 *
 * @author Laotang
 * @since 1.0
 */
@Handler(sort=0)
public class SecurityHandler implements IHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityHandler.class);

    @Override
    public boolean handler(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        LOGGER.info("请求uri: {}", uri);

        return true;
    }

}
