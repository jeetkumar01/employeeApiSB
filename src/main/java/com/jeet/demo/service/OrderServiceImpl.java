package com.jeet.demo.service;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;
import com.jeet.demo.repository.OrderRepository;
import com.jeet.demo.service.orderInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    @Override
    public String addOrder(PurchaseOrder order) {
        OrderRepository.save(order);
        return "Order added successfully";
    }

    @Override
    public List<PurchaseOrder> getOrder() {
      return OrderRepository.findAll();
    }

    @Override
    public Optional<PurchaseOrder> getOrderDetails(int id) {
      Optional<PurchaseOrder> order=OrderRepository.findById(id);
        return order;
    }

    @Override
    public List<OrderDto> getOrderList() {
        List<OrderDto> order=OrderRepository.getOrderList();
        return order;
    }
}
