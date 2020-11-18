<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yasas
  Date: 2020-11-18
  Time: 09.58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:setProperty property="*" name="employee"/>
<html>
<%--<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">--%>
<head>
    <title>Add an employee</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
</head>
<body>
<div class="container my-2">
    <h1>Add an employeewww</h1>
    <form:form action="/addemployee" object="${employee}" modelAttribute="employee" method="post">

        <form:label for="employeeId" path="employeeId">Employee ID</form:label>
        <form:input class="form-control" type="text" field="*{employeeId}" id="employeeId" placeholder="Employee ID" path="employeeId"/>
<%--        <span if="${fields.hasErrors('employeeId')}" errors="*{employeeId}"></span><br>--%>


        <form:label for="firstName" path="firstName">First Name</form:label>
        <form:input class="form-control" type="text" field="*{firstName}" id="firstName" placeholder="First Name" path="firstName"/>
<%--        <span if="${fields.hasErrors('firstName')}" errors="*{firstName}"></span><br>--%>

        <form:label for="lastName" path="lastName">Last Name</form:label>
        <form:input class="form-control" type="text" field="*{lastName}" id="lastName" placeholder="Last Name" path="lastName"/>
<%--        <span if="${fields.hasErrors('firstName')}" errors="*{firstName}"></span><br>--%>

        <form:label for="email" path="email">Email</form:label>
        <form:input class="form-control" type="text" field="*{email}" id="email" placeholder="Email" path="email"/>
<%--        <span if="${fields.hasErrors('email')}" errors="*{email}"></span><br>--%>

        <form:label for="nic" path="nic">NIC</form:label>
        <form:input class="form-control" type="text" field="*{nic}" id="nic" placeholder="NIC" path="nic"/>
<%--        <span if="${fields.hasErrors('nic')}" errors="*{nic}"></span><br>--%>

        <form:label for="experience" path="experience">Experience (Years)</form:label>
        <form:input class="form-control" type="text" field="*{experience}" id="experience" placeholder="Experience" path="experience"/>
<%--        <span if="${fields.hasErrors('experience')}" errors="*{experience}"></span><br>--%>


        <form:label for="departmentId" path="departmentId">Department ID</form:label>
        <form:input class="form-control" type="text" field="*{departmentId}" id="departmentId" placeholder="Department ID" path="departmentId"/>
<%--        <span if="${fields.hasErrors('departmentId')}" errors="*{departmentId}"></span><br>--%>

        <form:label for="sbuId" path="sbuId">Sbu ID</form:label>
        <form:input class="form-control" type="text" field="*{sbuId}" id="sbuId" placeholder="Sbu ID" path="sbuId"/>
<%--        <span if="${fields.hasErrors('sbuId')}" errors="*{sbuId}"></span><br>--%>

        <input type="submit" value="Add Employee" class="btn btn-primary btn-sm mb-3">
    </form:form>
</div>
</body>
</html>
