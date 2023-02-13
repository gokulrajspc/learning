package in.learning.reactive.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")

public class Product {

    @Id
    private String id;
    private String name;
    private int quantity;
    private double price;
}
