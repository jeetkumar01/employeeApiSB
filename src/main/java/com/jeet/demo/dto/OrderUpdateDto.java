package com.jeet.demo.dto;

public class OrderUpdateDto {
    Integer id;

    public OrderUpdateDto() {
    }

    public OrderUpdateDto(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
