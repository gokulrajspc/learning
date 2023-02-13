package com.learning.docker;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerTestApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to BAssure!!";
    }
    
    
    @GetMapping("/get-employee")
    public List<String> getEmployee(){
        List<String> employee = new ArrayList<>();
        employee.add("Arunkumar");
        employee.add("Thiluck");
        employee.add("Anand");
        employee.add("Jaydeep");
        employee.add("Kandan");
        return employee;
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(SpringDockerTestApplication.class, args);
    }

}
