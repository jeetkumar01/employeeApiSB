package com.jeet.demo.repository;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {
    @Query("SELECT new com.jeet.demo.dto.OrderDto( order.id,order.fName) FROM PurchaseOrder order")
    List<OrderDto> getOrderList();
}
