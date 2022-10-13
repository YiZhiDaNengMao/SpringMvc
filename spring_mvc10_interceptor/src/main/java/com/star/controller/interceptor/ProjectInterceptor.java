package com.star.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 1.定义拦截器类 */
//当前拦截器交由SpringMVC容器进行管理
@Component
public class ProjectInterceptor implements HandlerInterceptor {
    //原始方法调用之前 执行的方法
    /*
        注意: 返回值类型可以控制拦截是否放行, true表示放行, false表示终止
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle1 ...");
        return true;
    }

    //原始方法调用之后 执行的方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle1 ...");
    }

    //原始方法调用完成之后 响应视图之前 执行的方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion1 ...");
    }

}
