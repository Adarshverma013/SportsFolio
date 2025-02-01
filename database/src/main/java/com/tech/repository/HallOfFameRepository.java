package com.tech.repository;

import com.tech.entities.HallOfFame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallOfFameRepository extends JpaRepository<HallOfFame, Long> {
}
