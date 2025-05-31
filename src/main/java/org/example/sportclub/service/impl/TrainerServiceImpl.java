package org.example.sportclub.service.impl;

import org.example.sportclub.entity.Trainer;
import org.example.sportclub.repo.TrainerRepository;
import org.example.sportclub.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository repo;

    public TrainerServiceImpl(TrainerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Trainer create(Trainer trainer) {
        return repo.save(trainer);
    }

    @Override
    public List<Trainer> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Trainer> findById(Long id) {
        return repo.findById(id);
    }
}
