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
    private BigDecimal price;
    private String fName;
    private String lName;
    private String companyName;

    public PurchaseOrder(Integer id, String fName, String lName, String companyName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.companyName = companyName;
    }

    public PurchaseOrder() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
