package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.Employee;
import com.example.personnelmanagementsystem.repo.EmployeeRepo;
import com.example.personnelmanagementsystem.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void hire(Employee employee) {
        employeeRepo.save(employee);
    }
}
