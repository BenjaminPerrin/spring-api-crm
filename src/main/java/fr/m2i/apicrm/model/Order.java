/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.apicrm.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ben
 */

@Entity
@Table(name="orders")
public class Order {
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
     
}