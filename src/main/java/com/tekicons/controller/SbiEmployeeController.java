package com.tekicons.controller;


import com.tekicons.sbi.client.SbiServiceClient;
import com.tekicons.sbi.model.SbiEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sbi")
public class SbiEmployeeController {

    @Autowired
    private SbiServiceClient sbiServiceClient;

    @GetMapping("/all")
    public List<SbiEmployee> getAllSbiEmployees() {
        return this.sbiServiceClient.getAllSbiEmployees();
    }
}
