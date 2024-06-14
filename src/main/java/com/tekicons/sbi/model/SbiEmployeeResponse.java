package com.tekicons.sbi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SbiEmployeeResponse {

    private String status;
    private List<SbiEmployee> data;
}
