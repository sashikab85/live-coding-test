package com.codejam.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestFilter implements HandlerInterceptor {
   @Override
   public boolean preHandle
      (HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {
      System.out.println(">>>>>>>>> in coming request >>>>>>" + request.getRequestURI());
      return true;
   }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response,
      Object handler, ModelAndView modelAndView) throws Exception {
      System.out.println(">>>>>>>>> request post handle >>>>>>");
   }

   @Override
   public void afterCompletion
      (HttpServletRequest request, HttpServletResponse response, Object 
      handler, Exception exception) throws Exception {

      System.out.println(">>>>>>>>> out going response >>>>>>" + response.getStatus());
   }
}