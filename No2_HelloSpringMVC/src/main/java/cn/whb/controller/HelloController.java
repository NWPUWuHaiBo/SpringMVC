package cn.whb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.naming.ldap.Control;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author haiboWu
 * @create 2020-03-13 14:38
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","HelloSpringMVC!whb");
        mv.setViewName("hello");
        return mv;

    }
}
