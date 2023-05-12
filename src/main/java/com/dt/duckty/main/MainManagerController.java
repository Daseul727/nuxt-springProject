package com.dt.duckty.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainManagerController {

    @RequestMapping("/admin")
    public String index(Model model) {
        model.addAttribute("hello","서버통신 완료우");
        return "/index";
    }
}
