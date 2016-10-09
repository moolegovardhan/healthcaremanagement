package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="servicerequest", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class Services {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name="servicename", length=100)
	private String servicename;

	@Column(name="patientname", length=100)
	private String patientname;

	@Column(name="mobile", length=50)
	private String mobile;

	@Column(name="address", length=200)
	private String address;

	@Column(name="requestdate")
	private Date requestdate;

	@Column(name="requestserved", length=20)
	private String requestserved;

	@Column(name="attendername", length=50)
	private String attendername;

	@Column(name="insttype", length=20)
	private String insttype;

	@Column(name="instid", length=20)
	private String instid;

	@Column(name="receiptid", length=20)
	private String receiptid;

	@Column(name="assigneddate")
	private Date assigneddate;

	@Column(name="patientid", length=20)
	private Long patientid;

	@Column(name="comments", length=200)
	private String comments;

	@Column(name="appointmentid", length=20)
	private Long appointmentid;

	@Column(name="labid", length=20)
	private Long labid;

	@Column(name="hospitalid", length=20)
	private Long hospitalid;

	@Column(name="hospitalcomments", length=200)
	private String hospitalcomments;
	
	@Temporal(TemporalType.DATE)
	@Column(name="updatedate")
	private Date updatedate;

	@Column(name="createdBy")
	private String createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="createdDate")
	private Date createdDate;

	@Column(name="status", length=20)
	private String status;
	
	@Column(name="officeid", length=20)
	private String officeid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRequestdate() {
		return requestdate;
	}

	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}

	public String getRequestserved() {
		return requestserved;
	}

	public void setRequestserved(String requestserved) {
		this.requestserved = requestserved;
	}

	public String getAttendername() {
		return attendername;
	}

	public void setAttendername(String attendername) {
		this.attendername = attendername;
	}

	public String getInsttype() {
		return insttype;
	}

	public void setInsttype(String insttype) {
		this.insttype = insttype;
	}

	public String getInstid() {
		return instid;
	}

	public void setInstid(String instid) {
		this.instid = instid;
	}

	public String getReceiptid() {
		return receiptid;
	}

	public void setReceiptid(String receiptid) {
		this.receiptid = receiptid;
	}

	public Date getAssigneddate() {
		return assigneddate;
	}

	public void setAssigneddate(Date assigneddate) {
		this.assigneddate = assigneddate;
	}

	public Long getPatientid() {
		return patientid;
	}

	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(Long appointmentid) {
		this.appointmentid = appointmentid;
	}

	public Long getLabid() {
		return labid;
	}

	public void setLabid(Long labid) {
		this.labid = labid;
	}

	public Long getHospitalid() {
		return hospitalid;
	}

	public void setHospitalid(Long hospitalid) {
		this.hospitalid = hospitalid;
	}

	public String getHospitalcomments() {
		return hospitalcomments;
	}

	public void setHospitalcomments(String hospitalcomments) {
		this.hospitalcomments = hospitalcomments;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
