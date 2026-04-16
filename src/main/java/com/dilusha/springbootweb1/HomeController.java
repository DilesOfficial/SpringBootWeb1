package com.dilusha.springbootweb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home() {
        System.out.println("home method called");
        return "index.jsp";
    }
}
