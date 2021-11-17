package net.javaguides.sms.service.impl;

import java.util.List;

import net.javaguides.sms.entity.Employee;
import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Department;
import net.javaguides.sms.repository.DepartmentRepository;
import net.javaguides.sms.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        super();
        this.departmentRepository = departmentRepository;
    }


    @Override
    public Employee getDepartmentById(Long id) {
        return null;
    }

    @Override
    public Employee CountofeachEmployee(Long id) {
        return null;
    }

    @Override
    public void deleteDepartmentById(Long id) {

    }


    @Override
    public List<Department> getAllDepartment() {
        return null;
    }

    @Override
    public Department saveStudent(Employee student) {
        return null;
    }
}
