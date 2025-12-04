package com.example.employeeapp.service;

import com.example.employeeapp.entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee, Long departmentId);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
