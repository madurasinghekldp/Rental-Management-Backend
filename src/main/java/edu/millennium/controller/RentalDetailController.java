package edu.millennium.controller;

import edu.millennium.dto.Rental;
import edu.millennium.dto.RentalDetail;
import edu.millennium.service.RentalDetailService;
import edu.millennium.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent-detail")
@CrossOrigin
@RequiredArgsConstructor
public class RentalDetailController {

    private final RentalDetailService rentalDetailService;

    @PostMapping("add")
    public RentalDetail persist(@RequestBody RentalDetail rentalDetail){
        return rentalDetailService.persist(rentalDetail);
    }

    @GetMapping("all")
    public List<RentalDetail> getAll(){
        return rentalDetailService.getAll();
    }

    @DeleteMapping("delete")
    public void deleteById(@RequestParam(name="id") String id){
        rentalDetailService.deleteById(Long.parseLong(id));
    }

    @PutMapping("update")
    public void update(@RequestBody RentalDetail rentalDetail){
        rentalDetailService.update(rentalDetail);
    }
}
