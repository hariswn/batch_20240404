package com.tekicons.sbi.client;

import com.tekicons.sbi.model.SbiEmployee;
import com.tekicons.sbi.model.SbiEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class SbiServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public List<SbiEmployee> getAllSbiEmployees() {
        ResponseEntity<SbiEmployeeResponse> responseEntity = this.restTemplate.getForEntity(
                "https://dummy.restapiexample.com/api/v1/employees",
                SbiEmployeeResponse.class);
        if(responseEntity.hasBody()) {
            SbiEmployeeResponse sbiEmployeeResponse = responseEntity.getBody();
            return sbiEmployeeResponse.getData();
        }
        return null;
    }
}
