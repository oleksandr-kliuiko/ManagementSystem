package com.example.personnelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class StaffSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<WeekDay> weekDays;
    @OneToMany
    private List<Employee> employeeList;
}
