package com.tech.entities;

import com.tech.enums.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "user_sports")
public class UserSports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sports_id" , referencedColumnName = "id")
    private Sports sports;

    @Column(name = "experience_years")
    private Integer experienceYears;

    @Column(name = "level")
    private Level level;

    @Column(name = "is_primary")
    private Boolean isPrimary;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
}
