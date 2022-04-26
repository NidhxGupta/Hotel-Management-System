package com.example.hotelManagementSystem.Controller;

import java.util.List;

import com.example.hotelManagementSystem.MongoRepo;
import com.example.hotelManagementSystem.Model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CustomerController {

	@Autowired
	public MongoRepo repo;
	
	@GetMapping("/")
	public String homepage(Model model){
		return "userhomepage";
	}

	@GetMapping("/customerhomepage")
	public String customerhomepage(Model model){
		return "customerhomepage";
	}
	
	@GetMapping("/viewcustomer")
	public String viewCustomer(Model model) {
		List<Customer> customer = repo.findAll();
		model.addAttribute("allcustomers",customer);
		return "viewcustomer";
	}
	
	@GetMapping("/addcustomer")
	public String addCustomer(Model model) {
		model.addAttribute("customer",new Customer());
		return "addcustomer";
	}

	@PostMapping("/addcustomer")
	public String submitCustomer(@ModelAttribute("customer") Customer customer) {
		repo.save(customer);
		return "redirect:viewcustomer";
	}

	@GetMapping("/editcustomer")
	public String editCustomer(Model model) {
		model.addAttribute("customer",new Customer());
		return "editcustomer";
	}
	
		
	
	@PostMapping("/editcustomer")
	public String submiteditCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer.getNumber2());

		List<Customer> customers = repo.getCustomerByNumber(customer.getNumber());
		for (Customer m : customers) {
			m.setName(customer.getName2());
			m.setGender(customer.getGender2());
			m.setCountry(customer.getCountry2());
			m.setRoom(customer.getRoom2());
			m.setCheckInStatus(customer.getCheckInStatus2());
			m.setNumber(customer.getNumber2());
			m.setDeposit(customer.getDeposit2());
			repo.save(m);
					
		}
		
		return "redirect:viewcustomer";
		
	}
	
	@GetMapping("/deletecustomer")
	public String deleteCustomer(Model model) {
		model.addAttribute("customer",new Customer());
		return "deletecustomer";
	}
	
	
	@PostMapping("/deletecustomer")
	public String editedGreeting(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer.getNumber());
		List<Customer> customers = repo.getCustomerByNumber(customer.getNumber());
		for (Customer m : customers) {
			System.out.println(m.getNumber());
			repo.delete(m);
		}
		return "redirect:viewcustomer";
	}
}
