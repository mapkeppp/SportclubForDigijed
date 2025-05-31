package org.example.sportclub.service;

import org.example.sportclub.entity.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerService {
    Trainer create(Trainer trainer);
    List<Trainer> findAll();
    Optional<Trainer> findById(Long id);
}
