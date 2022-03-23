package com.pulkit.customer.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.pulkit.customer.data.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer , Long> {

}
