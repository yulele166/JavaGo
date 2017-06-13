/**
 * 
 */
package com.zexi.java.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yulele
 *
 * @time 2017年6月12日 上午10:42:25
 */
@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name",required=false,defaultValue="World")String name,Model model){
        model.addAttribute("name", name);
        return "hello";
    }

}
