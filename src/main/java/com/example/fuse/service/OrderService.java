package com.example.fuse.service;

import com.example.fuse.model.Order;
import com.example.fuse.model.OrderRequest;

public interface OrderService {

  Order place(OrderRequest orderRequest);

}
