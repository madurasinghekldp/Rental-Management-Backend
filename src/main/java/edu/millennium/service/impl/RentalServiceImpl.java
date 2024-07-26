package edu.millennium.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.millennium.dto.Rental;
import edu.millennium.entity.RentalEntity;
import edu.millennium.repository.RentalRepository;
import edu.millennium.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository rentalRepository;
    private final ObjectMapper mapper;

    public Rental persist(Rental rental){
        RentalEntity saved = rentalRepository.save(mapper.convertValue(rental, RentalEntity.class));
        return mapper.convertValue(saved,Rental.class);
    }

    public List<Rental> getAll(){
        Iterable<RentalEntity> all = rentalRepository.findAll();
        List<Rental> rentList = new ArrayList<>();
        all.forEach(rent -> {
            rentList.add((mapper.convertValue(rent,Rental.class)));
        });
        return rentList;
    }

    public void delete(Rental rental){
        rentalRepository.delete(mapper.convertValue(rental, RentalEntity.class));
    }

    public void deleteById(Long id){
        if(rentalRepository.existsById(id)) {
            rentalRepository.deleteById(id);
        }
    }

    public void update(Rental rental){
        rentalRepository.save(mapper.convertValue(rental, RentalEntity.class));
    }
}
