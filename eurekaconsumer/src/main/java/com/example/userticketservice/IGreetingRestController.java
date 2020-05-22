package com.example.userticketservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("TicketService")
public interface IGreetingRestController {

    @GetMapping("greet/{name}")
    public String sayHello(@PathVariable("name") String name);
}
