package com.reactive.spring.postgresql.repository;

import com.reactive.spring.postgresql.entity.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CustomerRepository extends R2dbcRepository<Customer, Integer> {}
