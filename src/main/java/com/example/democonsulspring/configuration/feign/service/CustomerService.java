package com.example.democonsulspring.configuration.feign.service;

import com.example.democonsulspring.configuration.feign.CustomerApi;
import com.example.democonsulspring.customer.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class CustomerService implements CustomerIntegration {

    @Value("${dynamic.parameter}")
    private String parameter;

    private final CustomerApi customerApi;

    public CustomerService(CustomerApi customerApi) {
        this.customerApi = customerApi;
    }

    @Override
    public Customer getCustomer() {
        return this.customerApi.getCustomer(Long.parseLong(parameter));
    }
}
