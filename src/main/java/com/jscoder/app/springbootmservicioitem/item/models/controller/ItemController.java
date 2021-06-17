package com.jscoder.app.springbootmservicioitem.item.models.controller;

import com.jscoder.app.springbootmservicioitem.item.models.Item;
import com.jscoder.app.springbootmservicioitem.item.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
@GetMapping("/listar")
    public List<Item> listar(){
    return  itemService.findAll();


    }

}
