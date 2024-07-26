package edu.millennium.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.millennium.dto.RentalDetail;
import edu.millennium.entity.RentalDetailEntity;
import edu.millennium.repository.RentalDetailRepository;
import edu.millennium.service.RentalDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalDetailServiceImpl implements RentalDetailService {

    private final RentalDetailRepository rentalDetailRepository;
    private final ObjectMapper mapper;

    public RentalDetail persist(RentalDetail rental){
        RentalDetailEntity saved = rentalDetailRepository.save(mapper.convertValue(rental, RentalDetailEntity.class));
        return mapper.convertValue(saved,RentalDetail.class);
    }

    public List<RentalDetail> getAll(){
        Iterable<RentalDetailEntity> all = rentalDetailRepository.findAll();
        List<RentalDetail> rentDetailList = new ArrayList<>();
        all.forEach(rent -> {
            rentDetailList.add((mapper.convertValue(rent,RentalDetail.class)));
        });
        return rentDetailList;
    }

    public void delete(RentalDetail rental){
        rentalDetailRepository.delete(mapper.convertValue(rental, RentalDetailEntity.class));
    }

    public void deleteById(Long id){
        if(rentalDetailRepository.existsById(id)) {
            rentalDetailRepository.deleteById(id);
        }
    }

    public void update(RentalDetail rental){
        rentalDetailRepository.save(mapper.convertValue(rental, RentalDetailEntity.class));
    }
}
