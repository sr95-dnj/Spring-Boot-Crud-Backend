package com.sr.spring_crud.controller;

import com.sr.spring_crud.domain.Employee;
import com.sr.spring_crud.dto.request.request.EmployeeRequest;
import com.sr.spring_crud.dto.request.response.EmployeeResponse;
import com.sr.spring_crud.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/create", produces = "application/json")
    public EmployeeRequest saveEmployee(@RequestBody EmployeeRequest request){
        return employeeService.saveEmployee(request);
    }

    @PutMapping("/update/{uuid}")
    public EmployeeResponse updateEmployee(@RequestBody EmployeeResponse response, @PathVariable String uuid){
        return employeeService.updateEmployee(response, uuid);
    }

    @GetMapping("find-all")
    public List<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("find-by-uuid/{uuid}")
    public EmployeeResponse findByUuid(@PathVariable String uuid){
        return employeeService.findByUuid(uuid);
    }

}
