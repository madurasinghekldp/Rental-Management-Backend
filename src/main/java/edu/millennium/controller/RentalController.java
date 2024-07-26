package edu.millennium.controller;

import edu.millennium.dto.Customer;
import edu.millennium.dto.Rental;
import edu.millennium.service.CustomerService;
import edu.millennium.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
@CrossOrigin
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @PostMapping("add")
    public Rental persist(@RequestBody Rental rental){
        return rentalService.persist(rental);
    }

    @GetMapping("all")
    public List<Rental> getAll(){
        return rentalService.getAll();
    }

    @DeleteMapping("delete")
    public void deleteById(@RequestParam(name="id") String id){
        rentalService.deleteById(Long.parseLong(id));
    }

    @PutMapping("update")
    public void update(@RequestBody Rental rental){
        rentalService.update(rental);
    }
}
