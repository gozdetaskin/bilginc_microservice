package com.customer.ms.rest.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer/query")
public class CustomerQuery
{
    @PostMapping
    public String update(@RequestBody final CustomerQueryData person) {
        return "OK";
    }
}