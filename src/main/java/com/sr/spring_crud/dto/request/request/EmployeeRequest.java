package com.sr.spring_crud.dto.request.request;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String uuid;
    private String name;
    private String address;
    private String mobile;
}
