package org.example.sportclub.service;

import org.example.sportclub.entity.TrainingSession;

import java.util.List;

public interface TrainingSessionService {
    TrainingSession create(TrainingSession session);
    List<TrainingSession> findByTrainer(Long trainerId);
}
