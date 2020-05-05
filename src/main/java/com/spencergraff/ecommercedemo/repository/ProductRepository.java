package com.spencergraff.ecommercedemo.repository;

import com.spencergraff.ecommercedemo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
