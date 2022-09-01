/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.apicrm.service;

import fr.m2i.apicrm.exception.NotFoundException;
import fr.m2i.apicrm.model.Customer;
import fr.m2i.apicrm.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ben
 */
@Service
public class CustomerService  implements ICustomerService{
    private final CustomerRepository repo;
    
    @Autowired
    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }
    
    public List<Customer> findAll() {
        return repo.findAll();
    }
    
    public Customer findBydId(Long id) throws NotFoundException {
        return repo.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Customer with id: " + id + " was not found");
        });
    }
    
    public void create(Customer customer) throws Exception {
        repo.save(customer);
    }
   
    public void save(Customer customer) {
        repo.save(customer);
    }
}
