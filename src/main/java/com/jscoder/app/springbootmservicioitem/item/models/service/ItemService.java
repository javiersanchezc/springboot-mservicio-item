package com.jscoder.app.springbootmservicioitem.item.models.service;

import com.jscoder.app.springbootmservicioitem.item.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public  Item findById(Long id,Integer cantidad);
}
