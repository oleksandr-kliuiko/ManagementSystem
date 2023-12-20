package com.example.personnelmanagementsystem.repo;

import com.example.personnelmanagementsystem.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager, Long> {
}
