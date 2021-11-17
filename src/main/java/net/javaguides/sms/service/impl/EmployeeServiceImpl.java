package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Employee;
import net.javaguides.sms.repository.EmployeeRepository;
import net.javaguides.sms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllStudents() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveStudent(Employee student) {
		return employeeRepository.save(student);
	}

	@Override
	public Employee getStudentById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee getStudentByContactnumber(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateStudent(Employee student) {
		return employeeRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		employeeRepository.deleteById(id);
	}

}
