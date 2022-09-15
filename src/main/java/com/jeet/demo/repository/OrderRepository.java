package com.jeet.demo.repository;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {
    @Query(value="SELECT new com.jeet.demo.dto.OrderDto( order.id,order.fName) FROM PurchaseOrder order",nativeQuery = true)
    List<OrderDto> getOrderList();

    @Modifying
    @Query(value="UPDATE PurchaseOrder order SET order.status = :status and order.actualDeliveryDate= :deliveryDate WHERE order.id = :id",nativeQuery = true)
    int setStatusForOrder(@Param("status") String status, @Param("id") Integer id, @Param("deliveryDate") String deliveryDate);
}
