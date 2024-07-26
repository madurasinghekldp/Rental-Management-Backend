package edu.millennium.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.millennium.dto.Item;
import edu.millennium.entity.ItemEntity;
import edu.millennium.repository.ItemRepository;
import edu.millennium.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ObjectMapper mapper;


    @Override
    public Item persist(Item item) {
        ItemEntity saved = itemRepository.save(mapper.convertValue(item, ItemEntity.class));
        return mapper.convertValue(saved,Item.class);
    }

    @Override
    public List<Item> getAll() {
        Iterable<ItemEntity> all = itemRepository.findAll();
        List<Item> itemList = new ArrayList<>();
        all.forEach(item -> {
            itemList.add(mapper.convertValue(item,Item.class));
        });
        return itemList;
    }

    @Override
    public void delete(Item item) {

    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void update(Item item) {
        itemRepository.save(mapper.convertValue(item,ItemEntity.class));
    }
}
