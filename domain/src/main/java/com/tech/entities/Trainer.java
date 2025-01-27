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

    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users userId;

    @Column(name = "certificate_url")
    private String certificateUrl;
    private Boolean isVerified;
    private Double rate;

    @Column(name = "rate_type")
    private String rateType;
    private String availability;

    @Column(name = "sports_id")
    private Long sportsId;


}
