package com.example.personnelmanagementsystem.services.impl;

import com.example.personnelmanagementsystem.entity.Employee;
import com.example.personnelmanagementsystem.repo.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepo employeeRepo;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    void delete_ShouldDeleteEmployeeById() {
        Long employeeId = 1L;

        employeeService.delete(employeeId);

        verify(employeeRepo).deleteById(employeeId);
    }

    @Test
    void hire_ShouldSaveEmployeeInRepo() {
        Employee employee = new Employee();

        employeeService.hire(employee);

        verify(employeeRepo).save(employee);
    }
}
