package com.example.guest.domainobjects;

public class GuestProfile {

	private String profileId;
	private String guestFirstName;
	private String guestLastName;
	
	public GuestProfile(String profileId){
		this.profileId=profileId;
	}
	
	public String getProfileId() {
		return profileId;
	}

	public String getGuestFirstName() {
		return guestFirstName;
	}
	public void setGuestFirstName(String guestFirstName) {
		this.guestFirstName = guestFirstName;
	}
	public String getGuestLastName() {
		return guestLastName;
	}
	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}
	
	

}
