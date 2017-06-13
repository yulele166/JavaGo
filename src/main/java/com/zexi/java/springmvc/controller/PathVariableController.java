/**
 * @PathVariable 用例
 */
package com.zexi.java.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yulele
 *
 * @time 2017年6月12日 下午4:39:04
 */
@Controller
@RequestMapping("owers/{owerId}")
public class PathVariableController {

    @RequestMapping("/pets/{petId}")
    public String findPet(@PathVariable String owerId,@PathVariable String petId,Model model) {
        System.out.println(owerId);
        System.out.println(petId);
        return "hello";
    }
}
