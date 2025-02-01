package com.tech.repository;

import com.tech.entities.TournamentParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentParticipantRepository extends JpaRepository<TournamentParticipant, Long> {
}
