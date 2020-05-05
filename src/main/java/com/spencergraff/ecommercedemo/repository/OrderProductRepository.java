package com.spencergraff.ecommercedemo.repository;

import com.spencergraff.ecommercedemo.model.OrderProduct;
import com.spencergraff.ecommercedemo.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
