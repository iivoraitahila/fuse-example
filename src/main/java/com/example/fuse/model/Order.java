package com.example.fuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Order implements Serializable {

  private final UUID id;
  private final List<OrderedProduct> products;

  public Order(List<OrderedProduct> products) {
    this.id = UUID.randomUUID();
    this.products = new ArrayList<OrderedProduct>(products);
  }

  @JsonProperty
  public List<OrderedProduct> products() {
    return Collections.unmodifiableList(products);
  }

  @JsonProperty
  public String id() {
    return id.toString();
  }

}
