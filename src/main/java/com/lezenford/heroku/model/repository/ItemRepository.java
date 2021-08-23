package com.lezenford.heroku.model.repository;

import com.lezenford.heroku.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
