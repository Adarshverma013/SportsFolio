package com.tech.dao;

import com.tech.entities.Fixtures;
import com.tech.repository.FixturesRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FixturesDAO {

    private final FixturesRepository fixturesRepository;

    public FixturesDAO(FixturesRepository fixturesRepository) {
        this.fixturesRepository = fixturesRepository;
    }

    public void saveFixture(Fixtures fixture) {
        fixturesRepository.save(fixture);
    }

    public void deleteFixture(Fixtures fixture) {
        fixturesRepository.delete(fixture);
    }

    public List<Fixtures> findAll() {
        return fixturesRepository.findAll();
    }

    public Optional<Fixtures> findById(Long id) {
        return fixturesRepository.findById(id);
    }
}
