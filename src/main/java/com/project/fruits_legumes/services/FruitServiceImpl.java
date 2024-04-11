package com.project.fruits_legumes.services;

import com.project.fruits_legumes.models.Fruit;
import com.project.fruits_legumes.repository.FruitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FruitServiceImpl implements FruitService{

    private final FruitRepository fruitRepository;
    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }
    @Override
    public Optional<Fruit> getFruitById(Long id) {
        return fruitRepository.findById(id);
    }
    @Override
    public boolean existsById(Long id) {
        return fruitRepository.existsById(id);
    }
    @Override
    public void deleteFruitById(Long id) {
        fruitRepository.deleteById(id);
    }
}
