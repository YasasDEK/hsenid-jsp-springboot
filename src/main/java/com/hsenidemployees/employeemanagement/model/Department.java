package com.hsenidemployees.employeemanagement.model;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    private Long departmentId;

    @Enumerated(EnumType.STRING)
    private DepartmentName departmentName;

    public Department() {
    }

    public Department(Long departmentId, DepartmentName departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public DepartmentName getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(DepartmentName departmentName) {
        this.departmentName = departmentName;
    }


}
