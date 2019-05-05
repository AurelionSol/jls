package com.qpanda.jls.Interceptor;

import com.qpanda.jls.pojo.Administrator;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BackInterceptor implements HandlerInterceptor {
    private static String username = "root";
    private static String password = "123456";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;
//        System.out.println("进入成功！");
        Administrator administrator = (Administrator) request.getSession().getAttribute("user");
        if (null == administrator) {
            // 如果用户为空则跳转到error页
            request.getRequestDispatcher(request.getContextPath() + "/error.html").forward(request, response);
//            response.sendRedirect(request.getContextPath() + "/error.html");
            flag = false;
        } else {
            // 对用户账号进行验证,是否正确
            if (administrator.getAdministratorname().equals(username) && administrator.getAdministratorpassword().equals(password)) {
//                System.out.println("访问后台API");
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
