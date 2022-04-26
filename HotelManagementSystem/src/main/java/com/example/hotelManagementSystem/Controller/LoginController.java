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
public class LoginController {

	@Autowired
	public MongoRepo repo;

    @GetMapping("/login")
	public String homepage(Model model){
		return "login";
	}
}
