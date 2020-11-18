package com.hsenidemployees.employeemanagement.model;

import java.io.Serializable;

public class EmployeePrimary implements Serializable {
    private Long employeeId;

    private Long departmentId;

    public EmployeePrimary(Long empId, Long depId) {
        this.employeeId = empId;
        this.departmentId = depId;
    }

    public EmployeePrimary() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
