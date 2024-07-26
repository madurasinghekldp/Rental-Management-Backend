package edu.millennium.controller;

import edu.millennium.dto.Customer;
import edu.millennium.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cust")
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("add")
    public Customer persist(@RequestBody Customer customer){
        return customerService.persist(customer);
    }

}
