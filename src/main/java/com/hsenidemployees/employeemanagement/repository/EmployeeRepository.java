package com.hsenidemployees.employeemanagement.repository;

import com.hsenidemployees.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Query("SELECT u.employeeId,u.firstName,u.lastName FROM Employee u WHERE u.nic LIKE '90%' ")
    Collection<String> findUsersNicStartsWith90();

    @Query("SELECT u.employeeId,u.firstName,u.lastName FROM Employee u WHERE u.experience > 5 ")
    Collection<String> UsersWorkForMoreThan5Years();
}