package com.example.redis.service;

import com.example.redis.model.Item;
import com.example.redis.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public Item getItem(String id) {
        return itemRepository.findById(id).orElse(null);
    }
}
