package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.StaffSchedule;
import com.example.personnelmanagementsystem.repo.StaffScheduleRepo;
import com.example.personnelmanagementsystem.services.StaffScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StaffScheduleServiceImpl implements StaffScheduleService {
    private final StaffScheduleRepo staffScheduleRepo;
    @Override
    public void add(StaffSchedule staffSchedule) {
        staffScheduleRepo.save(staffSchedule);
    }

    @Override
    public StaffSchedule viewSchedule(Long id) {
        return staffScheduleRepo.findById(id).get();
    }
}
