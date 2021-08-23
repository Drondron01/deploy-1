package com.lezenford.heroku.controller;

import com.lezenford.heroku.model.entity.Item;
import com.lezenford.heroku.model.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/item")
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable int id) {
        return itemRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @PostMapping
    public void save(@RequestBody Item item) {
        itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        itemRepository.deleteById(id);
    }
}
