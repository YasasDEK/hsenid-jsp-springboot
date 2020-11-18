<%@ page import="com.hsenidemployees.employeemanagement.model.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hsenidemployees.employeemanagement.service.EmployeeService" %>
<%@ page import="com.hsenidemployees.employeemanagement.controller.EmployeeController" %><%--
  Created by IntelliJ IDEA.
  User: yasas
  Date: 2020-11-18
  Time: 09.58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>Employees</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container my-2">
    <h1>Employees</h1>

<%--    <div switch="${listEmployees}">--%>

<%--        <h2 case="null">No Employees yet!</h2>--%>
<%--        <div case="*">--%>


            <a href = "/signup" class="btn btn-primary btn-sm mb-3"> Add Employee </a>

            <table border="1" class = "table table-striped table-responsive-md">
                <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>NIC</th>
                    <th>Experience</th>
                    <th>Department_ID</th>
                    <th>Sbu_ID</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listEmployees}" var="e">
                <tr>
                    <td>${e.employeeId}</td>
                    <td>${e.firstName}</td>
                    <td>${e.lastName}</td>
                    <td>${e.email}</td>
                    <td>${e.nic}</td>
                    <td>${e.experience}</td>
                    <td>${e.departmentId}</td>
                    <td>${e.sbuId}</td>
                    <td><a href="/edit/${e.employeeId}" class="btn btn-primary btn-sm mb-3">Edit</a></td>
                    <td><a href="/delete/${e.employeeId}" class="btn btn-danger btn-sm mb-3">Delete</a></td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
<%--        </div>--%>
<%--    </div>--%>
</div>
</body>
</html>
