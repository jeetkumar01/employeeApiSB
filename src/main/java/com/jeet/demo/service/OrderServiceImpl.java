package com.jeet.demo.service;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;
import com.jeet.demo.repository.OrderRepository;
import com.jeet.demo.service.orderInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public String addOrder(PurchaseOrder order) {
        order.setOrderDate(LocalDateTime.now().toString());
        order.setStatus("pending");
        orderRepository.save(order);
        return "Order added successfully";
    }

    @Override
    public List<PurchaseOrder> getOrder() {
      return orderRepository.findAll();
    }

    @Override
    public Optional<PurchaseOrder> getOrderDetails(int id) {
      Optional<PurchaseOrder> order=orderRepository.findById(id);
        return order;
    }

    @Override
    public List<OrderDto> getOrderList() {
        List<OrderDto> order=orderRepository.getOrderList();
        return null;
    }

    @Override
    public Boolean updateOrder(String status,Integer id){
        String deliveryDate=LocalDateTime.now().toString();
        int recordsUpdatedCount=orderRepository.setStatusForOrder(status,id,deliveryDate);
        if(recordsUpdatedCount==1){
            return true;
        }
        return false;
    };
}
