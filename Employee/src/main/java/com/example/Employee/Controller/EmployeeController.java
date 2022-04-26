package com.example.Employee.Controller; 

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee.MongoRepo;
import com.example.Employee.Model.Employee;


@Controller
public class EmployeeController {

	@Autowired
	public MongoRepo repo;
	
	@GetMapping("/")
	public String homepage(Model model){
		return "employeehomepage";
	}
	
	@GetMapping("/viewemployee")
	public String viewEmployee(Model model) {
		List<Employee> Employee = repo.findAll();
		model.addAttribute("allemployees",Employee);
		return "viewemployee";
	}
	
	@GetMapping("/addemployee")
	public String addEmployee(Model model) {
		model.addAttribute("Employee",new Employee());
		return "addemployee";
	}

	@PostMapping("/addemployee")
	public String submitemployee(@ModelAttribute("Employee") Employee Employee) {
		repo.save(Employee);
		return "redirect:viewemployee";
	}

	@GetMapping("/editemployee")
	public String editEmployee(Model model) {
		model.addAttribute("Employee",new Employee());
		return "editemployee";
	}
	
		
	
	@PostMapping("/editemployee")
	public String submiteditEmployee(@ModelAttribute("Employee") Employee Employee) {
		System.out.println(Employee.getEmployeeName2());

		List<Employee> Employees = repo.getEmployeeByEmployeeName(Employee.getEmployeeName());
		for (Employee e : Employees) {
			e.setEmployeeName(Employee.getEmployeeName2());
			e.setEmployeesalary(Employee.getEmployeesalary2());
			e.setEmployeedob(Employee.getEmployeedob2());
			e.setEmployeedescription(Employee.getEmployeedescription2());
			e.setEmployeestatus(Employee.getEmployeestatus2());
			repo.save(e);
					
		}
		
		return "redirect:viewemployee";
		
	}
	
	
}
