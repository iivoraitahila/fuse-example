package com.redhat.examples.fuse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductRequest {

  private final int code;
  private final int quantity;

  @JsonCreator
  public ProductRequest(@JsonProperty("code") int code,
                        @JsonProperty("quantity") int quantity) {
    this.code = code;
    this.quantity = quantity;
  }

  @JsonProperty
  public int code() {
    return code;
  }

  @JsonProperty
  public int quantity() {
    return quantity;
  }

}
