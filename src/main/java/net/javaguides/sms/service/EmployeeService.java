package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllStudents();
	
	Employee saveStudent(Employee student);
	
	Employee getStudentById(Long id);

	Employee getStudentByContactnumber(Long id);
	
	Employee updateStudent(Employee student);
	
	void deleteStudentById(Long id);
}
