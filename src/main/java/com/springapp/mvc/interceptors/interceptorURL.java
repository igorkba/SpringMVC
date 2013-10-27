package com.springapp.mvc.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: IgorK
 * Date: 11.9.2013
 * Time: 18:30
 * To change this template use File | Settings | File Templates.
 */
public class interceptorURL extends HandlerInterceptorAdapter {

    private String redirect;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        //System.out.println("preHandle");
        String uri = ((HttpServletRequest)request).getRequestURI().toString();
        if(!uri.equals(redirect))
        {
            response.sendRedirect(redirect);
            return false;
        }
        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("postHandle");
//        String uri = ((HttpServletRequest)request).getRequestURI().toString();
//        if(!uri.equals("/1/"))
//        {
//            response.sendRedirect("/1/");
//        }
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("afterCompletion");
//        return;
//    }
    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

}
