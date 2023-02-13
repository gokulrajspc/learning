
package com.learning.webclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ClientController {
    
    @GetMapping
    public String welcome(){
        return "Welcome";
    }
    
}
