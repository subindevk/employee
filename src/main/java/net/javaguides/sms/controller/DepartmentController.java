package net.javaguides.sms.controller;

import net.javaguides.sms.entity.Department;
import net.javaguides.sms.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Employee;
import net.javaguides.sms.service.DepartmentService;

@Controller
public class DepartmentController{
    private final DepartmentService DepartmentService;

    public DepartmentController(DepartmentService departmentService) {
        super();
        this.DepartmentService = departmentService;
    }

    @GetMapping("/department")
    public String listStudents(Model model) {
        model.addAttribute("department", DepartmentService.getAllDepartment());
        return "department";
    }

    @GetMapping("/department/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Department department = new Department();
        model.addAttribute("department",department);
        return "create_department";
    }

    @GetMapping("/department/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        DepartmentService.deleteDepartmentById(id);
        return "redirect:/department";
    }

    @GetMapping("/department/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", DepartmentService.getDepartmentById(id));
        return "edit_student";
    }

    @GetMapping("/department/count{id}")
    public String countform(@PathVariable Long id, Model model) {
        model.addAttribute("student", DepartmentService.CountofeachEmployee(id));
        return "employee";
    }


    @GetMapping("/department/add/new")
    public String createStudentForms(Model model) {

        // create student object to hold student form data
        Employee student = new Employee();
        model.addAttribute("student", student);
        return "create_student";
    }
}
