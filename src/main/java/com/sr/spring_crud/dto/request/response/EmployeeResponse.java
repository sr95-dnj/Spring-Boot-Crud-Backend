package com.sr.spring_crud.dto.request.response;

import lombok.Data;

@Data
public class EmployeeResponse {

    private Long id;
    private String uuid;
    private String name;
    private String address;
    private String mobile;
}
