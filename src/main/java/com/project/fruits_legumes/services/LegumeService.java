package com.project.fruits_legumes.services;

import com.project.fruits_legumes.models.Legume;
import java.util.List;
import java.util.Optional;


public interface LegumeService {

    List<Legume> getAllLegumes();

    Legume addLegume(Legume legume);

    Optional<Legume> getLegumeById(Long id);

    boolean existsById(Long id);

    void deleteLegumeById(Long id);

}
