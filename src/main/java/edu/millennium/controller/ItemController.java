package edu.millennium.controller;

import edu.millennium.dto.Customer;
import edu.millennium.dto.Item;
import edu.millennium.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("add")
    public Item persist(@RequestBody Item item){
        return itemService.persist(item);
    }

    @GetMapping("all")
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @DeleteMapping("delete")
    public void deleteById(@RequestParam(name="id") String id){
        itemService.deleteById(Long.parseLong(id));
    }

    @PutMapping("update")
    public void update(@RequestBody Item item){
        itemService.update(item);
    }
}
