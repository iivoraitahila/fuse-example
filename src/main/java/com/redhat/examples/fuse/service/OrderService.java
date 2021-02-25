package com.redhat.examples.fuse.service;

import com.redhat.examples.fuse.model.Order;
import com.redhat.examples.fuse.model.OrderRequest;

public interface OrderService {

  Order place(OrderRequest orderRequest);

}
