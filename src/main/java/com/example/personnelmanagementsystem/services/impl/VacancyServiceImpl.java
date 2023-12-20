package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.Vacancy;
import com.example.personnelmanagementsystem.repo.VacancyRepo;
import com.example.personnelmanagementsystem.services.VacancyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VacancyServiceImpl implements VacancyService {
    private final VacancyRepo vacancyRepo;
    @Override
    public void add(Vacancy vacancy) {
        vacancyRepo.save(vacancy);
    }
}
