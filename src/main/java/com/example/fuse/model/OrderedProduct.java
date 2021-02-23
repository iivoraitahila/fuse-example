package com.example.fuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrderedProduct implements Serializable {

  private final Product product;
  private final int quantity;

  public OrderedProduct(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  @JsonProperty
  public Product product() {
    return product;
  }

  @JsonProperty
  public int quantity() {
    return quantity;
  }

}
