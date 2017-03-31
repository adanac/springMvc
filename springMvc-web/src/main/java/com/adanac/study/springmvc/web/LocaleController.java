package com.adanac.study.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by allen on 2017/3/31.
 */
@Controller
public class LocaleController {
    @RequestMapping(value={"locale"},method = {RequestMethod.GET,RequestMethod.POST})
    public String locale(){
        return "locale.jsp";
    }
}
