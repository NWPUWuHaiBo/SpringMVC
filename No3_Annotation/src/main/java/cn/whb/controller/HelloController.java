package cn.whb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haiboWu
 * @create 2020-03-13 18:36
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","HelloAnnotation");
        return "test";
    }
}
