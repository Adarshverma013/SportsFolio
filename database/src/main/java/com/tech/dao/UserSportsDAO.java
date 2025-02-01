package com.tech.dao;

import com.tech.entities.UserSports;
import com.tech.repository.UserSportsRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserSportsDAO {

    private final UserSportsRepository userSportsRepository;

    public UserSportsDAO(UserSportsRepository userSportsRepository) {
        this.userSportsRepository = userSportsRepository;
    }

    public void saveUserSports(UserSports userSports) {
        userSportsRepository.save(userSports);
    }

    public void deleteUserSports(UserSports userSports) {
        userSportsRepository.delete(userSports);
    }

    public List<UserSports> findAll() {
        return userSportsRepository.findAll();
    }

    public Optional<UserSports> findById(Long id) {
        return userSportsRepository.findById(id);
    }
}
