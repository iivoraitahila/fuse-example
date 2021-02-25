package com.redhat.examples.fuse.helper;

import com.redhat.examples.fuse.model.Order;
import com.redhat.examples.fuse.model.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ResponseCreator {

  private final Random random = new Random();

  public OrderResponse createResponse(Order order) {
    return new OrderResponse(order, random.nextBoolean());
  }

}
