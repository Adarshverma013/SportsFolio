package com.tech.dao;

import com.tech.entities.Endorsement;
import com.tech.repository.EndorsementRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EndorsementDAO {

    private final EndorsementRepository endorsementRepository;

    public EndorsementDAO(EndorsementRepository endorsementRepository) {
        this.endorsementRepository = endorsementRepository;
    }

    public void saveEndorsement(Endorsement endorsement) {
        endorsementRepository.save(endorsement);
    }

    public void deleteEndorsement(Endorsement endorsement) {
        endorsementRepository.delete(endorsement);
    }

    public List<Endorsement> findAll() {
        return endorsementRepository.findAll();
    }

    public Optional<Endorsement> findById(Long id) {
        return endorsementRepository.findById(id);
    }

}
