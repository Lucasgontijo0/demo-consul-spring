package com.example.democonsulspring.customer;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Customer {
    private Long id;
    @NotNull(message = "Customer name must be not null.")
    private String name;
}
