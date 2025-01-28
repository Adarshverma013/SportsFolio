package com.tech.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "sports")
public class Sports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "sports", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserSports> userSports;

    @Column(name = "name")
    private String name;


    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

}
