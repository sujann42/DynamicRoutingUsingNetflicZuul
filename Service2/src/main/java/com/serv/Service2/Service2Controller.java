package com.serv.Service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping("/")
    public String getString(){
        return ("From Service 222!!! From Payment Service");
    }
}
