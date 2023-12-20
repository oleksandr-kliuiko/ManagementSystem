package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.Vacancy;
import com.example.personnelmanagementsystem.repo.VacancyRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class VacancyServiceImplTest {
    @Mock
    private VacancyRepo vacancyRepo;

    @InjectMocks
    private VacancyServiceImpl vacancyService;

    @Test
    void add_ShouldSaveVacancyInRepo() {
        Vacancy vacancy = new Vacancy();
        vacancyService.add(vacancy);
        verify(vacancyRepo).save(vacancy);
    }
}
