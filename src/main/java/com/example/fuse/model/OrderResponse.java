package com.example.fuse.model;

public class OrderResponse {

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
