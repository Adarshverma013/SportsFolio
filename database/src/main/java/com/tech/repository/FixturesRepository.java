package com.tech.repository;

import com.tech.entities.Fixtures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixturesRepository extends JpaRepository<Fixtures, Long> {
}
