package edu.millennium.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.millennium.dto.Customer;
import edu.millennium.entity.CustomerEntity;
import edu.millennium.repository.CustomerRepository;
import edu.millennium.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ObjectMapper mapper;

    public Customer persist(Customer customer){
        CustomerEntity saved = customerRepository.save(mapper.convertValue(customer, CustomerEntity.class));
        return mapper.convertValue(saved,Customer.class);
    }
}
