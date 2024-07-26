package edu.millennium.repository;

import edu.millennium.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<RentalEntity,Long> {
}
