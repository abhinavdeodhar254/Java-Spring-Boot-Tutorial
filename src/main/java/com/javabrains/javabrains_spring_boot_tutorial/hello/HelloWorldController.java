package com.javabrains.javabrains_spring_boot_tutorial.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
