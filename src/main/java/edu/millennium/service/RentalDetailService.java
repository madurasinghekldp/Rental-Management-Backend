package edu.millennium.service;

import edu.millennium.dto.Rental;
import edu.millennium.dto.RentalDetail;

import java.util.List;

public interface RentalDetailService {
    RentalDetail persist(RentalDetail rentalDetail);

    List<RentalDetail> getAll();

    void delete(RentalDetail rentalDetail);

    void deleteById(Long id);

    void update(RentalDetail rentalDetail);
}
