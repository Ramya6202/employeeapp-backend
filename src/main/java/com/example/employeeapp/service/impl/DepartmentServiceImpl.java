package com.example.employeeapp.service.impl;

import com.example.employeeapp.entity.Department;
import com.example.employeeapp.repository.DepartmentRepository;
import com.example.employeeapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElse(null); // Improvement later: custom exception
    }

    @Override
    public Department updateDepartment(Long id, Department updatedDept) {
        Department existing = getDepartmentById(id);
        if (existing != null) {
            existing.setName(updatedDept.getName());
            existing.setLocation(updatedDept.getLocation());
            return departmentRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
