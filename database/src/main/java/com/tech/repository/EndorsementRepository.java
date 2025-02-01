package com.tech.repository;

import com.tech.entities.Endorsement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndorsementRepository extends JpaRepository<Endorsement, Long> {
}
