package com.sr.spring_crud.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String name;
    private String address;
    private String mobile;
}
