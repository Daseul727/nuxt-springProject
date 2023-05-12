package com.dt.duckty.event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/event")
public class EventController {

    @RequestMapping("/list")
    public ModelAndView statisticsList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/event/list");
        return modelAndView;
    }
}
