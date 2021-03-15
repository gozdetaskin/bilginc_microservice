package com.customer.ms.rest.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customer.ms.rest.model.Customer;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class CustomerProvision {

    @PutMapping
    public String add(@RequestBody final Customer customer) {
        return "OK";
    }

    @DeleteMapping
    public String suspend(@RequestBody final Customer customer) {
        return "OK";
    }

    @PostMapping
    public String update(@RequestBody final Customer customer) {
        return "OK";
    }

    @GetMapping
    public Customer get(final Long cif) {
        return null;
    }
}