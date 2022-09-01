/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.apicrm.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class OrderDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="type")
    private String type;
    
    @Column(name="label")
    private String label;
    
    @Column(name="customer")
    private String customer;
    
    @Column(name="numberOfDays")
    private Number numberOfDays;
    
    @Column(name="unitPrice")
    private Number unitPrice;
    
    @Column(name="totalExcludeTaxe")
    private Number totalExcludeTaxe;
    
    @Column(name="totalWithTaxe")
    private Number totalWithTaxe;
    
    @Column(name="status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Number getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Number numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Number getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Number unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Number getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public void setTotalExcludeTaxe(Number totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public Number getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public void setTotalWithTaxe(Number totalWithTaxe) {
        this.totalWithTaxe = totalWithTaxe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
}