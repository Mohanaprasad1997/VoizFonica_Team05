package com.project.voizfonica.data;

import com.project.voizfonica.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {

    List<Order> findByuserid(String contact);
}

