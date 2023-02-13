
package com.learning.springwebclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Client {
    
    @GetMapping("/get")
    public String welcome(){
        return "Welcome to Bassure";
    }
    
    @GetMapping("/home")
    public String home(){
        return "Hi Good evening!";
    }
    
}

