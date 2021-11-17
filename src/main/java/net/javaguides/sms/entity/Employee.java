package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Name", nullable = false)
	private String Name;
	
	@Column(name = "contactnumber")
	private String contact_number;

	@Column(name = "departmentid")
	private String department_id;
	
	public Employee() {
		
	}
	
	public Employee(String Name, String contact_number, String department_id) {
		super();
		this.Name = Name;
		this.contact_number = contact_number;
		this.department_id = department_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return Name;
	}
	public void setFirstName(String firstName) {
		this.Name = Name;
	}
	public String getLastName() {
		return contact_number;
	}
	public void setLastName(String lastName) {
		this.contact_number = contact_number;
	}
	public String getEmail() {
		return department_id;
	}
	public void setEmail(String department_id) {
		this.department_id = department_id;
	}
}
