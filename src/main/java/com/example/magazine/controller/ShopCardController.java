package com.example.magazine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopCardController {
    @GetMapping("/card")
    public String cardFormCompilation(){
        return "card";

    }
}
