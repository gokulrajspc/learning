package in.bassure.batch6.webflux.demo.app.controller;

import in.bassure.batch6.webflux.demo.app.dto.Customer;
import in.bassure.batch6.webflux.demo.app.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public List<Customer> getAll() {
        return service.getAllCustomer();
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Customer> getAllStream() {
        return service.getAllCustomerStream();
    }
}
