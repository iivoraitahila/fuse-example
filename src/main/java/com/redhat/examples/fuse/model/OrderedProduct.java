package com.redhat.examples.fuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderedProduct {

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
