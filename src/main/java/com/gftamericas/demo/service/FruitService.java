package com.gftamericas.demo.service;

import com.gftamericas.demo.model.Fruit;
import com.gftamericas.demo.repository.FruitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;

    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public List<Fruit> getAll(){
        List<Fruit> fruits = fruitRepository.findAll();
        return fruits;
    }
}
