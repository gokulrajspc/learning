package in.bassure.batch6.webflux.demo.app.router;

import in.bassure.batch6.webflux.demo.app.handler.CustomerHandler;
import in.bassure.batch6.webflux.demo.app.handler.CustomerStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.RouterFunctions;


@Configuration
public class RouterConfig {

    @Autowired
    private CustomerHandler handler;
    
    @Autowired
    private CustomerStreamHandler streamHandler;
    
    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .GET("/router/customers", handler::loadCustomer)
                .GET("/router/customers/stream", streamHandler::getCustomers)
                .GET("/router/customer/{input}", handler::findCustomer)
                .POST("/router/customer/save", handler::saveCustomer)
                .build();
    }

}
