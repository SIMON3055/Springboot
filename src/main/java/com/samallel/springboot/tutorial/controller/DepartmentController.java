package com.samallel.springboot.tutorial.controller;

import com.samallel.springboot.tutorial.entity.Department;
import com.samallel.springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department GetDepartmentById(@PathVariable("id") Long departmentId)
    {
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String DeleteDepartmentById(@PathVariable("id") Long departmentId)
    {
         departmentService.deleteDepartmentById(departmentId);
         return "Deleted successfully";
    }
}
