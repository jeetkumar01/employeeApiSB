package com.jeet.demo.dto;

public class OrderDto {
    private Integer id;
    private String orderName;

    public OrderDto() {
    }

    public OrderDto(Integer id, String orderName) {
        this.id = id;
        this.orderName = orderName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getId() {
        return id;
    }

    public String getOrderName() {
        return orderName;
    }
}
