package com.tekicons.repository;

import com.tekicons.entity.MetaEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaEmployeeRepository extends CrudRepository<MetaEmployee, Integer> {
}
