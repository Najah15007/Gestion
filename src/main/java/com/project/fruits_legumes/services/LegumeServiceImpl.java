package com.project.fruits_legumes.services;

import com.project.fruits_legumes.models.Legume;
import com.project.fruits_legumes.repository.LegumeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class LegumeServiceImpl implements LegumeService{

    private final LegumeRepository legumeRepository;

    @Override
    public List<Legume> getAllLegumes() {
        return legumeRepository.findAll();
    }
    @Override
    public Legume addLegume(Legume legume) {
        return legumeRepository.save(legume);
    }
    @Override
    public Optional<Legume> getLegumeById(Long id) {
        return legumeRepository.findById(id);
    }
    @Override
    public boolean existsById(Long id) {
        return legumeRepository.existsById(id);
    }
    @Override
    public void deleteLegumeById(Long id) {
        legumeRepository.deleteById(id);
    }
}
