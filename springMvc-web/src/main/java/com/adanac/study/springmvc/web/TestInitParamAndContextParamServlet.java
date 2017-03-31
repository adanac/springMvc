package com.adanac.study.springmvc.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by allen on 2017/3/31.
 */
public class TestInitParamAndContextParamServlet extends HttpServlet {
    public TestInitParamAndContextParamServlet() {
        super();
    }

    public void init(){
        System.out.println("下面的这个参数 initParam1 是在servlet中存放的");
        System.out.println("init-param:"+this.getInitParameter("initParam1"));
        System.out.println("下面的这个参数是存放在servletContext中的");
        System.out.println("context-param:"+getServletContext().getInitParameter("contextParam1"));
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("this is doGet()....");
        this.doPost(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        System.out.println("this is doPost()....");
    }
}
