package com.jeet.demo.controller;

import com.jeet.demo.dto.OrderDto;
import com.jeet.demo.entity.PurchaseOrder;
import com.jeet.demo.entity.User;
import com.jeet.demo.exception.OrderNotFoundException;
import com.jeet.demo.service.orderInterface.OrderService;
import com.jeet.demo.service.orderInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PostMapping("/order")
    public ResponseEntity<?> addOrder(@RequestBody PurchaseOrder order){
       String result = orderService.addOrder(order);

    return new ResponseEntity<>(result,HttpStatus.CREATED);
    }

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody User user){
        String result = userService.addUser(user);

        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }

    @GetMapping("/order")
    public ResponseEntity<List<PurchaseOrder>> getOrder(){
        List<PurchaseOrder> order = orderService.getOrder();

        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> getLoginStatus(){
        List<PurchaseOrder> order = orderService.getOrder();

        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @GetMapping("/order/name")
    public ResponseEntity<List<OrderDto>> getOrderList(){
        List<OrderDto> order = orderService.getOrderList();
        System.out.println(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<?> getOrderDetails(@PathVariable int id) {

            Optional<PurchaseOrder> order = orderService.getOrderDetails(id);
            try{
                if(order.isPresent()){
                    return new ResponseEntity<>(order, HttpStatus.OK);
                }else{
                    throw new OrderNotFoundException("order not found");
                }
            }catch(OrderNotFoundException ex){
                return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
            }
    }
}
