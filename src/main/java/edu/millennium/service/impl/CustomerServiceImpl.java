package edu.millennium.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.millennium.dto.Customer;
import edu.millennium.entity.CustomerEntity;
import edu.millennium.repository.CustomerRepository;
import edu.millennium.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ObjectMapper mapper;

    public Customer persist(Customer customer){
        CustomerEntity saved = customerRepository.save(mapper.convertValue(customer, CustomerEntity.class));
        return mapper.convertValue(saved,Customer.class);
    }

    public List<Customer> getAll(){
        Iterable<CustomerEntity> all = customerRepository.findAll();
        List<Customer> custList = new ArrayList<>();
        all.forEach(cust -> {
            custList.add((mapper.convertValue(cust,Customer.class)));
        });
        return custList;
    }

    public void delete(Customer customer){
        customerRepository.delete(mapper.convertValue(customer, CustomerEntity.class));
    }

    public void deleteById(Long id){
        if(customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
    }
}
