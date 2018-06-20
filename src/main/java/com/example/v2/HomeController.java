package com.example.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getName()
    {
        return "Home Controller";
        //m1-c1
    }
}
