package com.sr.spring_crud.repository;

import com.sr.spring_crud.domain.Employee;
import com.sr.spring_crud.dto.request.response.EmployeeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByUuid(String uuid);
}
