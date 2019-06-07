package com.example.democonsulspring.configuration.feign;

import com.example.democonsulspring.customer.Customer;
import feign.Param;
import feign.RequestLine;

public interface CustomerApi {

    @RequestLine("GET /customer/{id}")
    Customer getCustomer(@Param("id") Long id);
}
