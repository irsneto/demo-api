package com.gftamericas.demo.controller;

import com.gftamericas.demo.model.Fruit;
import com.gftamericas.demo.service.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1")
@AllArgsConstructor
public class FruitController {

    private final FruitService fruitService;

    @PostMapping("/new")
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit){
        final Fruit save = fruitService.createFruit(fruit);
        return new ResponseEntity<Fruit>(save, HttpStatus.CREATED);
    }

    @PostMapping("/list")
    public ResponseEntity<List<Fruit>> listFruit(){
        final List<Fruit> fruitList = fruitService.getAll();
        return new ResponseEntity<List<Fruit>>(fruitList, HttpStatus.OK);
    }

}
