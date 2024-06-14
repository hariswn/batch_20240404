package com.tekicons.controller;

import com.tekicons.entity.MetaEmployee;
import com.tekicons.service.MetaEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/meta")
public class MetaEmployeeController {

    @Autowired
    private MetaEmployeeService service;

    @PostMapping("/register")
    public MetaEmployee save(@Valid  @RequestBody MetaEmployee employee) {
        return this.service.save(employee);
    }

    @GetMapping("/employee/{id}")
    public MetaEmployee getEmployeeById(@PathVariable Integer id) {
        return this.service.getEmployeeById(id);
    }

    @GetMapping("/all")
    public List<MetaEmployee> getAllEmployees() {
        return this.service.getAllEmployees();
    }

}
