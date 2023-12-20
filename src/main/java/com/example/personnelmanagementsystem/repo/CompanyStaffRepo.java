package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.CompanyStaff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyStaffRepo extends JpaRepository<CompanyStaff, Long> {
}
