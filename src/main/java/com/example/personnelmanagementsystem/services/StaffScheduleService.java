package com.example.personnelmanagementsystem.services;

import com.example.personnelmanagementsystem.entity.StaffSchedule;

public interface StaffScheduleService {
    void add(StaffSchedule staffSchedule);
    StaffSchedule viewSchedule(Long id);
}
