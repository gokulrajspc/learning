package in.bassure.batch6.webflux.demo.app.service;

import in.bassure.batch6.webflux.demo.app.dao.CustomerDao;
import in.bassure.batch6.webflux.demo.app.dto.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao dao;

    public List<Customer> getAllCustomer() {
        long start = System.currentTimeMillis();
        List<Customer> customers = dao.getCustomers();
        long end = System.currentTimeMillis();
        System.out.println("Total Execution Time : " + (end - start));
        return customers;
    }

    public Flux<Customer> getAllCustomerStream  () {
        long start = System.currentTimeMillis();
        Flux<Customer> customers = dao.getCustomersStream();
        long end = System.currentTimeMillis();
        System.out.println("Total Execution Time : " + (end - start));
        return customers;
    }
}