package org.example.crud.customer.service;

import org.example.crud.customer.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer create(Customer customer);

    void delete(Customer customer);

    Customer findById(Long id);

    List<Customer> customers();
}
