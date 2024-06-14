package com.tekicons.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "meta_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int employeeId;

    @NotNull(message = "Employee name should be declare")
    @Column(name = "emp_name")
    private String employeeName;

    @NotNull(message = "Address should be declare")
    private String address;

    @Column(name = "mobile_no")
    private int mobileNumber;

}
