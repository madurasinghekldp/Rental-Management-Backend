package edu.millennium.service;

import edu.millennium.dto.Customer;

import java.util.List;

public interface CustomerService {
    Customer persist(Customer customer);

    List<Customer> getAll();

    void delete(Customer customer);

    void deleteById(Long id);

    void update(Customer customer);
}
