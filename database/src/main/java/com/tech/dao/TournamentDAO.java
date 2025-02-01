package com.tech.dao;

import com.tech.entities.Tournament;
import com.tech.repository.TournamentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TournamentDAO {

    private final TournamentRepository tournamentRepository;

    public TournamentDAO(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    public void saveTournament(Tournament tournament) {
        tournamentRepository.save(tournament);
    }

    public void deleteTournament(Tournament tournament) {
        tournamentRepository.delete(tournament);
    }

    public List<Tournament> findAll() {
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> findById(Long id) {
        return tournamentRepository.findById(id);
    }
}
