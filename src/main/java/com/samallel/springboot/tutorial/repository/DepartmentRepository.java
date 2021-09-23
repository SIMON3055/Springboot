package com.samallel.springboot.tutorial.repository;
import com.samallel.springboot.tutorial.entity.Department;
import com.samallel.springboot.tutorial.service.DepartmentService;
import com.samallel.springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
