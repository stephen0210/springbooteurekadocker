package com.example.userticketservice;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingRestController  {

    @Autowired
    EurekaClient eurekaClient;

    @Autowired
    IGreetingRestController iGreetingRestController;

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name){
        String block = iGreetingRestController.sayHello(name);
        return "Hi "+ block + " , How are you ";
    }

}
