package com.dt.duckty.statistics;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/statistics")
public class StatisticsManagerController {

    @RequestMapping("/list")
    public ModelAndView statisticsList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/statistics/list");
        return modelAndView;
    }
}
