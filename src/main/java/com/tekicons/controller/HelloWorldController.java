package com.tekicons.controller;

import com.tekicons.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
    public Employee getEmployee() {

        Employee e = new Employee();
        e.setId(101);
        e.setName("Abc");
        e.setAddress("Hyd");
        return e;
    }
}
