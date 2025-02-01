package com.tech.dao;

import com.tech.entities.HallOfFame;
import com.tech.repository.HallOfFameRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HallOfFameDAO {

    private final HallOfFameRepository hallOfFameRepository;

    public HallOfFameDAO(HallOfFameRepository hallOfFameRepository) {
        this.hallOfFameRepository = hallOfFameRepository;
    }

    public void saveHallOfFame(HallOfFame hallOfFame) {
        hallOfFameRepository.save(hallOfFame);
    }

    public void deleteHallOfFame(HallOfFame hallOfFame) {
        hallOfFameRepository.delete(hallOfFame);
    }

    public List<HallOfFame> findAll() {
        return hallOfFameRepository.findAll();
    }

    public Optional<HallOfFame> findById(Long id) {
        return hallOfFameRepository.findById(id);
    }
}
