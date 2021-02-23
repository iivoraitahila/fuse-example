package com.example.fuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Product implements Serializable {

  private final int code;
  private final String name;

  public Product(int code, String name) {
    this.code = code;
    this.name = name;
  }

  @JsonProperty
  public int code() {
    return code;
  }

  @JsonProperty
  public String name() {
    return name;
  }

}
