package com.example.fuse.helper;

import com.example.fuse.model.OrderResponse;
import com.example.fuse.model.Order;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ResponseCreator {

  private final Random random = new Random();

  public OrderResponse createResponse(Order order) {
    return new OrderResponse(order, random.nextBoolean());
  }

}
