package com.sr.spring_crud.service.serviceImpl;

import com.sr.spring_crud.domain.Employee;
import com.sr.spring_crud.dto.request.request.EmployeeRequest;
import com.sr.spring_crud.dto.request.response.EmployeeResponse;
import com.sr.spring_crud.repository.EmployeeRepository;
import com.sr.spring_crud.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Override
    public EmployeeRequest saveEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        String uuid = UUID.randomUUID().toString();
        BeanUtils.copyProperties(employeeRequest, employee);
        employee.setUuid(uuid);
        employeeRepository.save(employee);
        return employeeRequest;
    }

    @Override
    public EmployeeResponse updateEmployee(EmployeeResponse response3, String uuid) {
        Optional<Employee> requestOptional = employeeRepository.findByUuid(uuid);
        Employee response = requestOptional.get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(response3, employee);
        employeeRepository.save(employee);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        BeanUtils.copyProperties(employee, employeeResponse);
        return employeeResponse;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    @Override
    public EmployeeResponse findByUuid(String uuid) {
        Optional<Employee> optional = employeeRepository.findByUuid(uuid);
        Employee response = optional.get();
        EmployeeResponse response1 = new EmployeeResponse();
        BeanUtils.copyProperties(response, response1);
        return response1;
    }
}
