package com.spencergraff.ecommercedemo.repository;

import com.spencergraff.ecommercedemo.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
