package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepo extends JpaRepository<Report, Long> {
}
