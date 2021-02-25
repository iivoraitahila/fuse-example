package com.redhat.examples.fuse.service.impl;

import com.redhat.examples.fuse.model.*;
import com.redhat.examples.fuse.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

  private Map<Integer, Product> productsMap;

  public OrderServiceImpl() {
    productsMap = new HashMap<Integer, Product>();
    productsMap.put(1, new Product(1, "Camel In Action"));
    productsMap.put(2, new Product(2, "Corona vaccine"));
    productsMap.put(3, new Product(3, "Donald Trump happy birthday tweet"));
    productsMap.put(4, new Product(4, "Square ball"));
    productsMap.put(5, new Product(5, "VPN access"));
  }

  public Order place(OrderRequest orderRequest) {
    List<OrderedProduct> products = new ArrayList<OrderedProduct>();
//    for (ProductRequest request : orderRequest.getProducts()) {
//      products.add(new OrderedProduct(productsMap.get(request.code()), request.quantity()));
//    }
    return new Order(products);
  }

}
