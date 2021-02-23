package com.example.fuse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrderRequest {

  private final List<ProductRequest> products;

  @JsonCreator
  public OrderRequest(@JsonProperty("products") List<ProductRequest> products) {
    this.products = products;
  }

  public List<ProductRequest> getProducts() {
    return products;
  }

}
