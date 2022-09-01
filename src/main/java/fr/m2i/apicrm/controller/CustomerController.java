/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.apicrm.controller;

import fr.m2i.apicrm.dto.CustomerDTO;
import fr.m2i.apicrm.model.Customer;
import fr.m2i.apicrm.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author ben
 */
@Controller
public class CustomerController {
    private final CustomerService service;
    
    @Autowired
    public CustomerController(CustomerService service){
        this.service = service;
    }
    
    @GetMapping("/customers")
    public List<Customer> getCustomerList(){
        return service.findAll();
    }
    
    @GetMapping("/customer/{id}")
    public List<Customer> getCustomerById(){
        return service.findAll();
    }
    
    @ModelAttribute("customerDTO")
    public CustomerDTO addCustomerDTO() {
        return new CustomerDTO();
    }
}
