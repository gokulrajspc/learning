package com.learning.springreactivemongocrud.repository;

import com.learning.springreactivemongocrud.dto.ProductDto;
import com.learning.springreactivemongocrud.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

    public Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
    
}
