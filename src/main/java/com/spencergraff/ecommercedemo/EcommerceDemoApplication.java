package com.spencergraff.ecommercedemo;

import com.spencergraff.ecommercedemo.model.Product;
import com.spencergraff.ecommercedemo.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "TV Set", 300.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Ice Cream", 5.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Root Beer", 3.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
          productService.save(new Product(7L, "Tants", 30.00, "http://placehold.it/200x100"));
        };
    }
}
