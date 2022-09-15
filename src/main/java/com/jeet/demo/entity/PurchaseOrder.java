package com.jeet.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer poNumber;
    private String status;
    private String poType;
    private Integer containerId;
    private String poName;
    private String orderDate;
    private String expectedDeliveryDate;
    private String actualDeliveryDate;
    private BigDecimal price;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer id, Integer poNumber, String status, String poType, Integer containerId, String poName, String orderDate, String expectedDeliveryDate, String actualDeliveryDate, BigDecimal price) {
        this.id = id;
        this.poNumber = poNumber;
        this.status = status;
        this.poType = poType;
        this.containerId = containerId;
        this.poName = poName;
        this.orderDate = orderDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.actualDeliveryDate = actualDeliveryDate;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPoNumber(Integer poNumber) {
        this.poNumber = poNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPoType(String poType) {
        this.poType = poType;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public void setActualDeliveryDate(String actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPoNumber() {
        return poNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getPoType() {
        return poType;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public String getPoName() {
        return poName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
