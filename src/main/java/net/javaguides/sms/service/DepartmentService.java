package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Department;
import net.javaguides.sms.entity.Employee;
import org.springframework.stereotype.Service;

@Service

public interface DepartmentService {

    List<Employee> getAllDepartment();

    Department saveStudent(Employee student);

    Employee getDepartmentById(Long id);

    Employee CountofeachEmployee(Long id);

    void deleteDepartmentById(Long id);
}
