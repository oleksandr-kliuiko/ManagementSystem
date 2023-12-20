package com.example.personnelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Position position;
    @OneToOne
    private Department department;
}
