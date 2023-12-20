package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.CompanyStaff;
import com.example.personnelmanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
