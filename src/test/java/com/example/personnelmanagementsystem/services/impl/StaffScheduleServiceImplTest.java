package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.StaffSchedule;
import com.example.personnelmanagementsystem.repo.StaffScheduleRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class StaffScheduleServiceImplTest {
    @Mock
    private StaffScheduleRepo staffScheduleRepo;

    @InjectMocks
    private StaffScheduleServiceImpl staffScheduleService;

    @Test
    void add_ShouldSaveStaffScheduleInRepo() {
        StaffSchedule staffSchedule = new StaffSchedule();

        staffScheduleService.add(staffSchedule);

        verify(staffScheduleRepo).save(staffSchedule);
    }

    @Test
    void viewSchedule_ShouldReturnStaffScheduleById() {
        Long scheduleId = 1L;
        StaffSchedule staffSchedule = new StaffSchedule();
        when(staffScheduleRepo.findById(scheduleId)).thenReturn(Optional.of(staffSchedule));

        StaffSchedule retrievedSchedule = staffScheduleService.viewSchedule(scheduleId);

        assertNotNull(retrievedSchedule);
        verify(staffScheduleRepo).findById(scheduleId);
    }
}
