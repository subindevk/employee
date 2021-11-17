package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Employee;
import net.javaguides.sms.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService studentService;

	public EmployeeController(EmployeeService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/employee")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/employee/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Employee student = new Employee();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/employee")
	public String saveStudent(@ModelAttribute("student") Employee student) {
		studentService.saveStudent(student);
		return "redirect:/employee";
	}
	
	@GetMapping("/employee/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@GetMapping("/employee/search")
	public String searchform(@PathVariable  Long Contact_number, Model model){
		model.addAttribute("student", studentService.getStudentByContactnumber(Contact_number));
		return "student";
	}

	@PostMapping("/employee/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Employee student,
			Model model) {
		
		// get student from database by id
		Employee existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/employee";
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/employee/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/employee";
	}
	
}
