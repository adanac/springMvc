package com.adanac.study.springmvc.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by allen on 2017/3/31.
 */
@Controller
public class GoController implements EnvironmentAware{
    private Log log = LogFactory.getLog(GoController.class);

    //    处理head类型的/请求
    @RequestMapping(value = {"/head"}, method = {RequestMethod.HEAD})
    public String head() {
        return "head.jsp";
    }

    @RequestMapping(value = {"/index","/"},method = {RequestMethod.GET,RequestMethod.POST})
    public String index(Model model){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("msg","go to lauch");
        map.put("name","allen");
        map.put("time","22:22");
        model.addAllAttributes(map);
        log.info("=======index1========");
        model.addAttribute("msg1","hi,msg");
        model.addAttribute("map",map);
        return "go.jsp";
    }

    private Environment environment = null;
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
