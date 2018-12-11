package com.roomwebapp;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.landon.aop.Timed;

@RestController
@RequestMapping("/api")
public class ApiController {

	private RoomServices roomServices;
	
	@Autowired
	public ApiController(RoomServices roomServices) {
		super();
		this.roomServices=roomServices;
	}
	
	@GetMapping("/rooms")
	@Timed
	public List<Room> getAllRooms(){
		return this.roomServices.getAllRooms();
	}
	
	@GetMapping("/locale")
	public String getLocale() {
		final Date now = Calendar.getInstance(Locale.getDefault()).getTime();
		
		System.out.println(now);
		return now.toString();
	}
}
