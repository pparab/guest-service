package com.example.guest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.guest.domainobjects.GuestProfile;

@RestController
@RequestMapping(GuestController.WAR_BASE_URL)
public class GuestController {
	
	public static final String WAR_BASE_URL = "svc/v1/guest";
	
	@GetMapping("/{id}")
	public GuestProfile getGuestProfile(@PathVariable("id") String id) {
		GuestProfile guestProfile = new GuestProfile(id);
		guestProfile.setGuestFirstName("Prashant");
		guestProfile.setGuestLastName("Parab");
		return guestProfile;
	
	}
	

}
