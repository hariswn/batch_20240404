package com.tekicons.service.impl;

import com.tekicons.entity.MetaEmployee;
import com.tekicons.exception.EmployeeNotFoundException;
import com.tekicons.repository.MetaEmployeeRepository;
import com.tekicons.service.MetaEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetaEmployeeServiceImpl implements MetaEmployeeService {

    @Autowired
    private MetaEmployeeRepository repository;

    @Override
    public MetaEmployee save(MetaEmployee employee) {

        MetaEmployee response = this.repository.save(employee);
        return response;
    }

    @Override
    public MetaEmployee getEmployeeById(Integer id) {
        Optional<MetaEmployee> optional = this.repository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }

        throw new EmployeeNotFoundException("Employee not found with the empId : " + id);
    }

    @Override
    public List<MetaEmployee> getAllEmployees() {
        List<MetaEmployee> employees = (List<MetaEmployee>) this.repository.findAll();
        return employees;
    }
}
