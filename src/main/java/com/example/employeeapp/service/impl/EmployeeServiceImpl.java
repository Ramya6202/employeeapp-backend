package com.example.employeeapp.service.impl;

import com.example.employeeapp.entity.Employee;
import com.example.employeeapp.entity.Department;
import com.example.employeeapp.repository.EmployeeRepository;
import com.example.employeeapp.repository.DepartmentRepository;
import com.example.employeeapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee createEmployee(Employee employee, Long departmentId) {
        Department dept = departmentRepository.findById(departmentId).orElse(null);

        if (dept == null) {
            return null;
        }

        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Long id, Employee newEmployee) {
        Employee exist = employeeRepository.findById(id).orElse(null);
        if (exist == null)
            return null;

        exist.setName(newEmployee.getName());
        exist.setSalary(newEmployee.getSalary());

        return employeeRepository.save(exist);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
