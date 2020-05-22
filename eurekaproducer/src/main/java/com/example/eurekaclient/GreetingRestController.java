package com.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingRestController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Welcome "+ name;
    }

}
