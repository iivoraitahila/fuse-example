package com.example.fuse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class OrderRequest implements Serializable {

  private final List<ProductRequest> products;

  @JsonCreator
  public OrderRequest(@JsonProperty("products") List<ProductRequest> products) {
    this.products = products;
  }

  public List<ProductRequest> getProducts() {
    return products;
  }

}
