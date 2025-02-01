package com.tech.dao;

import com.tech.entities.Trainer;
import com.tech.repository.TrainerRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TrainerDAO {

    private final TrainerRepository trainerRepository;

    public TrainerDAO(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public void saveTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    public void deleteTrainer(Trainer trainer) {
        trainerRepository.delete(trainer);
    }

    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    public Optional<Trainer> findById(Long id) {
        return trainerRepository.findById(id);
    }
}
