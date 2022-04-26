package com.example.Room.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Room")
public class Room {
	private String RoomNo;
	private String RoomType;
	private String CleanStatus;
	private String Availability;
	private String CustomerName;
	private String id;
	
	private String RoomNo2;
	private String RoomType2;
	private String CleanStatus2;
	private String Availability2;
	private String CustomerName2;
	private String id2;
	
	

	public String getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(String RoomNo) {
		this.RoomNo = RoomNo;
	}

	
	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String RoomType) {
		this.RoomType = RoomType;
	}

	public String getCleanStatus() {
		return CleanStatus;
	}

	public void setCleanStatus(String CleanStatus) {
		this.CleanStatus = CleanStatus;
	}

	public String getAvailability() {
		return Availability;
	}

	public void setAvailability(String Availability) {
		this.Availability = Availability;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}


	public String getRoomNo2() {
		return RoomNo2;
	}

	public void setRoomNo2(String RoomNo2) {
		this.RoomNo2 = RoomNo2;
	}

	
	public String getRoomType2() {
		return RoomType2;
	}

	public void setRoomType2(String RoomType2) {
		this.RoomType2 = RoomType2;
	}

	public String getCleanStatus2() {
		return CleanStatus2;
	}

	public void setCleanStatus2(String CleanStatus2) {
		this.CleanStatus2 = CleanStatus2;
	}

	public String getAvailability2() {
		return Availability2;
	}

	public void setAvailability2(String Availability2) {
		this.Availability2 = Availability2;
	}

	public String getCustomerName2() {
		return CustomerName2;
	}

	public void setCustomerName2(String CustomerName2) {
		this.CustomerName2 = CustomerName2;
	}

	public String getId() {
		return id;
	}
	
	public String getId2() {
		return id2;
	}
	
}
