/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.apicrm.dto;

import fr.m2i.apicrm.model.Customer;

/**
 *
 * @author ben
 */
public class CustomerMapper {
    public static CustomerDTO buildCustomerDTO(Customer customer){
        if (customer == null) {
            return null;
        }
        String state;
        if (customer.getState()) {
            state = "ACTIF";
        }else{
            state = "INACTIF";
        }
        // ou sinon en ternaire
        //String state = customer.getState() != null && customer.getState() ? "ACTIF" : "INACTIF";
    return new CustomerDTO(customer.getId(), customer.getLastname(),
            customer.getFirstname(), customer.getCompany(), customer.getMail(),
            customer.getPhone(), customer.getAddress(), customer.getZipCode(),
            customer.getCity(), customer.getCountry(), state);        
    
    }
    
    public static Customer buildCustomer(CustomerDTO customerDTO){
        if (customerDTO == null) {
            return null;
        }
        Boolean state;
        if (customerDTO.getState() == "ACTIF") {
            state = true;
        }else{
            state = false;
        }
        Customer newCustomer = new Customer(customerDTO.getId(), customerDTO.getLastname(), customerDTO.getFirstname(), customerDTO.getCompany(), customerDTO.getMail(), customerDTO.getPhone(), customerDTO.getAddress(), customerDTO.getZipCode(), customerDTO.getCity(), customerDTO.getCountry(), state);        
        return newCustomer;
    }
    
     public static Customer copy(Customer customer){

        return new Customer(customer.getId(), customer.getLastname(), customer.getFirstname(), customer.getCompany(), customer.getMail(), customer.getPhone(), customer.getAddress(), customer.getZipCode(), customer.getCity(), customer.getCountry(), customer.getState());        
    }
}
