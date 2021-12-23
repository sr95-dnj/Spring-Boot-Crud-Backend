package com.sr.spring_crud.service;

import com.sr.spring_crud.domain.Employee;
import com.sr.spring_crud.dto.request.request.EmployeeRequest;
import com.sr.spring_crud.dto.request.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    EmployeeRequest saveEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse updateEmployee(EmployeeResponse response, String uuid);

    List<Employee> findAllEmployee();

    EmployeeResponse findByUuid(String uuid);

}
