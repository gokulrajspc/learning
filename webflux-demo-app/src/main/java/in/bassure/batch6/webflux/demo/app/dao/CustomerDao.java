package in.bassure.batch6.webflux.demo.app.dao;

import in.bassure.batch6.webflux.demo.app.dto.Customer;
import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class CustomerDao {

    private static void sleepExecution(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Customer> getCustomers() {
        return IntStream.rangeClosed(1, 20)
                .peek(CustomerDao::sleepExecution)
                .peek(i -> System.out.println("Processing Count: " + i))
                .mapToObj(i -> new Customer(i, "customer" + i))
                .collect(Collectors.toList());

    }

    public Flux<Customer> getCustomersStream() {
        return Flux.range(1, 20)
                .delayElements(Duration.ofMillis(500))
                .doOnNext(i -> System.out.println("Processing Count in Stream Flow: " + i))
                .map(i -> new Customer(i, "customer" + i));
    }

    public Flux<Customer> getCustomerList() {
        return Flux.range(1, 20)
                .doOnNext(i -> System.out.println("Processing Count in Stream Flow: " + i))
                .map(i -> new Customer(i, "customer" + i));
    }
}
