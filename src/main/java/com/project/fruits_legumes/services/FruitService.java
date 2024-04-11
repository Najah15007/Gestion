package com.project.fruits_legumes.services;

import com.project.fruits_legumes.models.Fruit;

import java.util.List;
import java.util.Optional;


public interface FruitService {

    List<Fruit> getAllFruits();

    Fruit addFruit(Fruit fruit);

    Optional<Fruit> getFruitById(Long id);

    boolean existsById(Long id);

    void deleteFruitById(Long id);

}
