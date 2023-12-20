package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyRepo extends JpaRepository<Vacancy, Long> {
}
