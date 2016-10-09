package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "rooms_details", uniqueConstraints = { @UniqueConstraint (columnNames = "roomid")})
public class RoomsDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", unique = true, nullable = false)
	private Long id;
	
	
	@Column (name = "roomid", unique = true, nullable = false)
	private Long roomid;
	
	@Column(name="roomname", length=100)
	private String roomname;
	
	@Column (name = "occupancy", nullable = false)
	private String occupancy;
	
	@Column (name = "createdDate", nullable = false)
	private Date createdDate;
	
	@Column (name = "createdBy", nullable = false)
	private String createdBy;
	
	@Column (name = "status", nullable = false)
	private String status;
	
	@Column(name = "officeid", length=10)
	private String officeid;
	

	@OneToOne(optional=false,cascade=CascadeType.ALL, mappedBy="id")
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	//@OneToOne(cascade=CascadeType.ALL, mappedBy="roomid", targetEntity=RoomCharges.class)

	public Long getRoomid() {
		return roomid;
	}
	
	
	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOfficeid() {
		return officeid;
	}

	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	
	
}
