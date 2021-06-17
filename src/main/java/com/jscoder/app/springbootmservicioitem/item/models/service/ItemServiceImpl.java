package com.jscoder.app.springbootmservicioitem.item.models.service;

import com.jscoder.app.springbootmservicioitem.item.models.Item;
import com.jscoder.app.springbootmservicioitem.item.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements  ItemService{
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<Item> findAll() {
        List<Producto> productos= Arrays.asList(restTemplate.getForObject("http://localhost:8200/listar",Producto[].class));
        return productos.stream().map(p-> new Item(p,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return null;
    }
}
