package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.StaffSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffScheduleRepo extends JpaRepository<StaffSchedule, Long> {
}
