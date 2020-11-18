package com.hsenidemployees.employeemanagement.controller;

import com.hsenidemployees.employeemanagement.model.Employee;
import com.hsenidemployees.employeemanagement.repository.EmployeeRepository;
import com.hsenidemployees.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/", method = RequestMethod.GET)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String getAllEmployees(Model model) {
        System.out.println("Nic starts with 90 :" + employeeRepository.findUsersNicStartsWith90());
        System.out.println("Worked more than 5 years " + employeeRepository.UsersWorkForMoreThan5Years());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(employeeService.getAllEmployees());
        model.addAttribute("listEmployees",employeeList);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id, Model model) {
        employeeService.deleteEmployee((long)id);
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Employee employee) {
        return "add-employee";
    }

    @PostMapping("/addemployee")
    public String addEmployee(@Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-employee";
        }
        System.out.println("aaa : " + employee.getEmployeeId());
        System.out.println("bbb : " + employee);
        employeeService.addEmployee(employee,result,model);
        model.addAttribute("employee", employee);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeeService.showUpdateForm((long )id);
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Employee employee,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            employee.setEmployeeId(id);
            return "update-employee";
        }

        employeeService.updateUser((long) id, employee);
        return "redirect:/";
    }


}