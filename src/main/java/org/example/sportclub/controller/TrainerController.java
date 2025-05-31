package org.example.sportclub.controller;

import org.example.sportclub.entity.Trainer;
import org.example.sportclub.service.TrainerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    private final TrainerService svc;

    public TrainerController(TrainerService svc) {
        this.svc = svc;
    }

    @GetMapping
    public List<Trainer> all() {
        return svc.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trainer> one(@PathVariable Long id) {
        return svc.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Trainer create(@RequestBody Trainer trainer) {
        return svc.create(trainer);
    }
}
