package edu.millennium.service;


import edu.millennium.dto.Item;

import java.util.List;

public interface ItemService {
    Item persist(Item item);

    List<Item> getAll();

    void delete(Item item);

    void deleteById(Long id);

    void update(Item item);
}
