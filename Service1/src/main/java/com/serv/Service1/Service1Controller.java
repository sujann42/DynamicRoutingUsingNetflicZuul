package com.serv.Service1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
    @GetMapping("/")
    public String getString(){
        return ("From Service 1111!!! Order Service");
    }
}
