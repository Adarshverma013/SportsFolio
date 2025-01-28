package com.tech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sports_id", referencedColumnName = "id")
    private Sports sports;

    @Column(name = "certificate_url")
    private String certificateUrl;

    @Column(name = "is_verified")
    private Boolean isVerified;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "rate_type")
    private String rateType;

    @Column(name = "availability")
    private String availability;



}
