package org.example.sportclub.service.impl;

import org.example.sportclub.entity.TrainingSession;
import org.example.sportclub.repo.TrainingSessionRepository;
import org.example.sportclub.service.TrainingSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingSessionServiceImpl implements TrainingSessionService {
    private final TrainingSessionRepository repo;

    public TrainingSessionServiceImpl(TrainingSessionRepository repo) {
        this.repo = repo;
    }

    @Override
    public TrainingSession create(TrainingSession session) {
        return repo.save(session);
    }

    @Override
    public List<TrainingSession> findByTrainer(Long trainerId) {
        return repo.findByTrainerId(trainerId);
    }
}
