package com.lezenford.heroku.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private int price;
}
