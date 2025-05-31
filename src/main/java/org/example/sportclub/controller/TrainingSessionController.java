package org.example.sportclub.controller;

import org.example.sportclub.entity.TrainingSession;
import org.example.sportclub.service.TrainingSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class TrainingSessionController {
    private final TrainingSessionService svc;

    public TrainingSessionController(TrainingSessionService svc) {
        this.svc = svc;
    }

    @PostMapping
    public TrainingSession create(@RequestBody TrainingSession session) {
        return svc.create(session);
    }

    @GetMapping("/by-trainer/{trainerId}")
    public List<TrainingSession> byTrainer(@PathVariable Long trainerId) {
        return svc.findByTrainer(trainerId);
    }
}
