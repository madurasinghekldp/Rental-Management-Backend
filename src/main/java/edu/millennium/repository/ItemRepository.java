package edu.millennium.repository;

import edu.millennium.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,Long> {
}
