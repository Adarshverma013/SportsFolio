package com.tech.dao;

import com.tech.entities.TournamentParticipant;
import com.tech.repository.TournamentParticipantRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TournamentParticipantDAO {

    private final TournamentParticipantRepository tournamentParticipantRepository;

    public TournamentParticipantDAO(TournamentParticipantRepository tournamentParticipantRepository) {
        this.tournamentParticipantRepository = tournamentParticipantRepository;
    }

    public void saveTournamentParticipant(TournamentParticipant tournamentParticipant) {
        tournamentParticipantRepository.save(tournamentParticipant);
    }

    public void deleteTournamentParticipant(TournamentParticipant tournamentParticipant) {
        tournamentParticipantRepository.delete(tournamentParticipant);
    }

    public List<TournamentParticipant> findAll() {
        return tournamentParticipantRepository.findAll();
    }


    public Optional<TournamentParticipant> findById(Long id) {
        return tournamentParticipantRepository.findById(id);
    }

}
