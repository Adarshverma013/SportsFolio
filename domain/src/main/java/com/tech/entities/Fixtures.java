package com.tech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

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
    @JoinColumn(name = "participant_1_id" , referencedColumnName = "id")
    private Tournament_Participant participant1Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "participant_2_id" , referencedColumnName = "id")
    private Tournament_Participant participant2Id;

    private Integer round;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "winner_id" , referencedColumnName = "id")
    private Tournament_Participant winnerId;

    @Column(name = "match_date")
    private Timestamp matchDate;

}
