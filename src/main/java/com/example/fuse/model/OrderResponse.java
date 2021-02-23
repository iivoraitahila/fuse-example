package com.example.fuse.model;

import java.io.Serializable;

public class OrderResponse implements Serializable {

  private final Order order;
  private final boolean approved;

  public OrderResponse(Order order, boolean approved) {
    this.order = order;
    this.approved = approved;
  }

  public Order order() {
    return order;
  }

  public boolean approved() {
    return approved;
  }

}
