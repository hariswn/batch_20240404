package com.tekicons.service;

import com.tekicons.entity.MetaEmployee;

import java.util.List;

public interface MetaEmployeeService {

    MetaEmployee save(MetaEmployee employee);
    MetaEmployee getEmployeeById(Integer id);

    List<MetaEmployee> getAllEmployees();
}
