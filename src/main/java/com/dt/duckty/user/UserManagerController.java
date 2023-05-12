package com.dt.duckty.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/user")
public class UserManagerController {

    @GetMapping("/list")
    public ModelAndView userList(ModelAndView modelAndView) {
        modelAndView.setViewName("page/user/list");
        return modelAndView;
    }
}
