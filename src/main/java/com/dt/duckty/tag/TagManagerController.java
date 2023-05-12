package com.dt.duckty.tag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/tag")
public class TagManagerController {

    @RequestMapping("/list")
    public ModelAndView statisticsList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/tag/list");
        return modelAndView;
    }
}
