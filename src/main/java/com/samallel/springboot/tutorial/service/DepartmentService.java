package com.samallel.springboot.tutorial.service;

import com.samallel.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public void deleteDepartmentById(Long departmentId);

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department getDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
