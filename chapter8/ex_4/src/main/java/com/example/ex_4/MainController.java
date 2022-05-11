package com.example.ex_4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            Model page
    ) {
        page.addAttribute("color", color);
        page.addAttribute("username", "Katy");
        return "home.html";
    }

}
