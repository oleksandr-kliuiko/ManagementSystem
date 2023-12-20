package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
