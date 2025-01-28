package com.tech.entities;

import com.tech.enums.GameStage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "fixtures")
public class Fixtures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id" , referencedColumnName = "id")
    private Tournament tournamentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "first_participant_id" , referencedColumnName = "id")
    private TournamentParticipant firstParticipantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "second_participant_id" , referencedColumnName = "id")
    private TournamentParticipant secondParticipantId;

    @Column(name = "round")
    @Enumerated(EnumType.STRING)
    private GameStage round;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "winner_id" , referencedColumnName = "id")
    private TournamentParticipant winnerId;

    @Column(name = "match_date")
    private LocalDate matchDate;

}
