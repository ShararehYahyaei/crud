package org.example.crud.customer.controller;


import lombok.RequiredArgsConstructor;
import org.example.crud.customer.model.Customer;
import org.example.crud.customer.service.CustomerService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CustomerController {
//
//    private final CustomerService customerService;

    @GetMapping("/getCustomer")
    public Customer saveCustomer(@Validated Customer customer) {
        return new Customer("ali","amir");


    }
}
