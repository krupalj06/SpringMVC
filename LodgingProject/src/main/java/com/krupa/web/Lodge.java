package com.krupa.web;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Lodging")
public class Lodge implements Serializable{
	
	@Column(name="room_id")
	@Id
	@GenericGenerator(name="id", strategy="increment")
	@GeneratedValue(generator = "id")
	private int roomid;
	
	@Column(name="lodge_name")
	String LodgeName;
	
	@Column(name="location")
	String location;
	
	@Column(name="px")
	int px;
	
	@Column(name="no_of_days")
	int noOfDays;
	
	public Lodge() {
	}
	
	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getLodgeName() {
		return LodgeName;
	}

	public void setLodgeName(String lodgeName) {
		LodgeName = lodgeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Lodge [roomid=" + roomid + ", LodgeName=" + LodgeName + ", location=" + location + ", px=" + px
				+ ", noOfDays=" + noOfDays + "]";
	}
	
	

}
