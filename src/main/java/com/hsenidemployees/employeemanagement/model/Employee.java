package com.hsenidemployees.employeemanagement.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
//@IdClass(EmployeePrimary.class)
public class Employee {
    @Id
    private Long employeeId;
    @Column
    @NotBlank(message = "department Id is mandatory")
    private Long departmentId;
    @Column
    @Email
    @NotBlank(message = "Email is mandatory")
    private String email;
    @Column
    @NotBlank(message = "First Name is mandatory")
    private String firstName;
    @Column
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;
    @Column
    @NotBlank(message = "NIC is mandatory")
    private String nic;
    @Column
    @NotBlank(message = "sbu Id is mandatory")
    private int sbuId;
    @Column
    @NotBlank(message = "Experience Id is mandatory")
    private int experience;

    public Employee() {
    }

    public Employee(long employeeId, long departmentId, String email, String firstName, String lastName, int sbuId, String nic, int experience) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.sbuId = sbuId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nic = nic;
        this.experience = experience;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSbuId() {
        return sbuId;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public String getNic() { return nic; }

    public void setNic(String nic) { this.nic = nic; }

    public int getExperience() { return experience; }

    public void setExperience(int experience) { this.experience = experience; }

}
