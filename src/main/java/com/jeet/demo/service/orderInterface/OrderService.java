package com.jeet.demo.service.orderInterface;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public String addOrder(PurchaseOrder order);
    public List<PurchaseOrder> getOrder() ;
    public Optional<PurchaseOrder> getOrderDetails(int id);
    public List<OrderDto> getOrderList();
}
