package com.example.personnelmanagementsystem.services;

import com.example.personnelmanagementsystem.entity.Employee;

public interface EmployeeService {
    void delete(Long id);
    void hire(Employee employee);
}
