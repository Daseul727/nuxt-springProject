package com.dt.duckty.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/menu")
public class MenuController {
    @RequestMapping("/list")
    public ModelAndView statisticsList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/menu/list");
        return modelAndView;
    }
}
