package in.learning.reactive.crud.repository;

import in.learning.reactive.crud.dto.ProductDto;
import in.learning.reactive.crud.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, String> {

    public Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);

}
