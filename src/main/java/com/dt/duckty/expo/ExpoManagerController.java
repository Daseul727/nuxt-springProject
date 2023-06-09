package com.dt.duckty.expo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/expo")
public class ExpoManagerController {
    @RequestMapping("/list")
    public ModelAndView statisticsList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/expo/list");
        return modelAndView;
    }
}
