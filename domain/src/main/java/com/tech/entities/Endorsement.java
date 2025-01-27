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
@Table(name = "endorsement")
public class Endorsement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endorser_id" , referencedColumnName = "id")
    private Users endorserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endorsed_id" , referencedColumnName = "id")
    private Users endorsedId;

    private String badge;
    private String message;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
