package com.example.Room.Controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Room.MongoRepo;
import com.example.Room.Model.Room;


@Controller
public class RoomController {

	@Autowired
	public MongoRepo repo;
	
	@GetMapping("/")
	public String homepage(Model model){
		return "roomhomepage";
	}
	
	@GetMapping("/viewroom")
	public String viewRoom(Model model) {
		List<Room> Room = repo.findAll();
		model.addAttribute("allrooms",Room);
		return "viewroom";
	}
	
	@GetMapping("/addroom")
	public String addRoom(Model model) {
		model.addAttribute("Room",new Room());
		return "addroom";
	}

	@PostMapping("/addroom")
	public String submitRoom(@ModelAttribute("Room") Room Room) {
		repo.save(Room);
		return "redirect:viewroom";
	}

	@GetMapping("/editroom")
	public String editRoom(Model model) {
		model.addAttribute("Room",new Room());
		return "editroom";
	}
	
		
	
	@PostMapping("/editroom")
	public String submiteditRoom(@ModelAttribute("Room") Room Room) {
		System.out.println(Room.getRoomNo2());

		List<Room> Rooms = repo.getRoomByRoomNo(Room.getRoomNo());
		for (Room r : Rooms) {
			r.setRoomNo(Room.getRoomNo2());
			r.setRoomType(Room.getRoomType2());
			r.setCleanStatus(Room.getCleanStatus2());
			r.setAvailability(Room.getAvailability2());
			r.setCustomerName(Room.getCustomerName2());
			repo.save(r);
					
		}
		
		return "redirect:viewroom";
		
	}
	
	
}
