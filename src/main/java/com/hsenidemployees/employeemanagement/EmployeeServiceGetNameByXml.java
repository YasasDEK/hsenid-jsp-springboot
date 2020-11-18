package com.hsenidemployees.employeemanagement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceGetNameByXml {
    String employeeName;
    static List<String> employeeNameList = new ArrayList<String>();

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        employeeNameList.add(employeeName);
        this.employeeName = employeeName;
    }

    public static List<String> fetchEmployee() {
        return employeeNameList;
    }

    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("Employee name property is set : " + employeeName);
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Employee clean up");
    }

}
