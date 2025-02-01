package com.tech.dao;

import com.tech.entities.Sports;
import com.tech.repository.SportsRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SportsDAO {

    private final SportsRepository sportsRepository;

    public SportsDAO(SportsRepository sportsRepository) {
        this.sportsRepository = sportsRepository;
    }

    public void saveSport(Sports sport) {
        sportsRepository.save(sport);
    }

    public void deleteSport(Sports sport) {
        sportsRepository.delete(sport);
    }

    public List<Sports> findAll() {
        return sportsRepository.findAll();
    }

    public Optional<Sports> findById(Long id) {
        return sportsRepository.findById(id);
    }
}
