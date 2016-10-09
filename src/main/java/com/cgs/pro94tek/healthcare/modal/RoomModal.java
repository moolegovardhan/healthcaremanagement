package com.cgs.pro94tek.healthcare.modal;

import com.cgs.pro94tek.healthcare.bean.RoomType;

public class RoomModal {
	
	private Long id;
	private RoomType roomtype;
	private String roomname;
	private String officeid;
	private String totalrooms;
	private String roomcost;
	private String status;
	private String createdDate;
	private String createdBy;
	private String discount;
	private String finalprice;
	private String charges;
	private String totaloccupied;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RoomType getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public String getTotalrooms() {
		return totalrooms;
	}
	public void setTotalrooms(String totalrooms) {
		this.totalrooms = totalrooms;
	}
	public String getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(String roomcost) {
		this.roomcost = roomcost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public String getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(String finalprice) {
		this.finalprice = finalprice;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getTotaloccupied() {
		return totaloccupied;
	}
	public void setTotaloccupied(String totaloccupied) {
		this.totaloccupied = totaloccupied;
	}
	
	
}
