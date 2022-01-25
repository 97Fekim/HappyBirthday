package com.example.HappyBirthday.repository;

import com.example.HappyBirthday.repository.domain.Present;

import java.util.List;

public interface PresentRepository {
    Present save(Present present);
    List<Present> findAll();
}
