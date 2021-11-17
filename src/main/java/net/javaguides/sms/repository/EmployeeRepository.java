package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
