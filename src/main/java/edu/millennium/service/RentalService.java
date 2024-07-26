package edu.millennium.service;

import edu.millennium.dto.Rental;

import java.util.List;

public interface RentalService {
    Rental persist(Rental rental);

    List<Rental> getAll();

    void delete(Rental rental);

    void deleteById(Long id);

    void update(Rental rental);
}
