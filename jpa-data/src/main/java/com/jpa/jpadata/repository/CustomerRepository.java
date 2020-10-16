package com.jpa.jpadata.repository;

import java.util.List;

import com.jpa.jpadata.model.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  
  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}
