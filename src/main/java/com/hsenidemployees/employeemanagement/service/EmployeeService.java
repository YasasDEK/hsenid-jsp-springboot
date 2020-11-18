package com.hsenidemployees.employeemanagement.service;

import com.hsenidemployees.employeemanagement.model.Employee;
import com.hsenidemployees.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Collection<? extends Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    public void deleteEmployee(long id) {
        Employee employee = employeeRepository.findById((long)id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + (long)id));
        employeeRepository.deleteById((long)id);
    }

    public void addEmployee(Employee employee, BindingResult result, Model model) {
        employee.setEmployeeId((long)employee.getEmployeeId());
        employee.setDepartmentId((long)employee.getDepartmentId());
        employee.setExperience(employee.getExperience());
        employee.setEmail(employee.getEmail());
        employee.setFirstName(employee.getFirstName());
        employee.setLastName(employee.getLastName());
        employee.setSbuId(employee.getSbuId());
        model.addAttribute("employee", employee);
        employeeRepository.save(employee);
    }

    public Employee showUpdateForm(long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        return employee;
    }

    public void updateUser(long id, Employee employee) {
        employeeRepository.save(employee);
    }

}
