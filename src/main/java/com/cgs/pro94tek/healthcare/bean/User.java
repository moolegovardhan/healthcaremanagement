package com.cgs.pro94tek.healthcare.bean;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="users", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	private int id;

	@Column(length=20)
	private String aadharcard;

	@Column(length=1000)
	private String address;

	@Column(length=100)
	private String addressline1;

	@Column(length=100)
	private String addressline2;

	@Column(length=10)
	private Integer age = 0;

	@Column(length=10)
	private String altmobile;

	@Column(length=20)
	private String cardamount;

	@Temporal(TemporalType.DATE)
	private Date cardexpiry;

	@Column(length=20)
	private String cardtype;

	@Column(length=50)
	private String city;

	@Column(length=10)
	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddate;
	
	@Column(length=10)
	private Integer credits = 0;

	@Column(length=50)
	private String department;

	@Column(length=100)
	private String district;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(length=20)
	private String doctorid;

	@Column(length=50)
	private String email;

	@Column(length=50)
	private String firstname;

	@Column(length=20)
	private String gender;

	@Column(length=20)
	private String insttype;

	@Column(length=20)
	private String landline;

	@Column(length=50)
	private String lastname;

	@Column(length=50)
	private String middlename;

	@Column(length=15)
	private String mobile;

	@Column(length=100)
	private String name;
	
	@Column(length=10, nullable = true)
	private Integer officeid = 0;

	@Column(length=5)
	private Integer otp = 0;

	@Column(nullable=false, length=1000)
	private String password;

	@Column(length=50)
	private String patientuniqueid;

	@Column(length=100)
	private String policyid;

	@Column(length=100)
	private String policytype;

	@Column(length=10)
	private String profession;

	@Column(length=20)
	private String quickregister;

	@Column(length=20)
	private String registeredfrom;

	@Column(length=20)
	private String salesperson;

	@Column(length=50)
	private String state;

	@Column(length=2)
	private String status;

	@Column(length=100)
	private Integer totalamount = 0;

	@Column(length=1000)
	private String udid;

	@Column(nullable=false, length=20)
	private String username;

	@Column(length=10)
	private String userrole;

	@Column(length=20)
	private String voucher;

	@Column(length=20)
	private String wallet;

	@Column(length=10)
	private String zipcode;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadharcard() {
		return this.aadharcard;
	}

	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAltmobile() {
		return this.altmobile;
	}

	public void setAltmobile(String altmobile) {
		this.altmobile = altmobile;
	}

	public String getCardamount() {
		return this.cardamount;
	}

	public void setCardamount(String cardamount) {
		this.cardamount = cardamount;
	}

	public Date getCardexpiry() {
		return this.cardexpiry;
	}

	public void setCardexpiry(Date cardexpiry) {
		this.cardexpiry = cardexpiry;
	}

	public String getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Integer getCredits() {
		return this.credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDoctorid() {
		return this.doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInsttype() {
		return this.insttype;
	}

	public void setInsttype(String insttype) {
		this.insttype = insttype;
	}

	public String getLandline() {
		return this.landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOfficeid() {
		return this.officeid;
	}

	public void setOfficeid(Integer officeid) {
		
		this.officeid = officeid;
	}

	public Integer getOtp() {
		return this.otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientuniqueid() {
		return this.patientuniqueid;
	}

	public void setPatientuniqueid(String patientuniqueid) {
		this.patientuniqueid = patientuniqueid;
	}

	public String getPolicyid() {
		return this.policyid;
	}

	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

	public String getPolicytype() {
		return this.policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getQuickregister() {
		return this.quickregister;
	}

	public void setQuickregister(String quickregister) {
		this.quickregister = quickregister;
	}

	public String getRegisteredfrom() {
		return this.registeredfrom;
	}

	public void setRegisteredfrom(String registeredfrom) {
		this.registeredfrom = registeredfrom;
	}

	public String getSalesperson() {
		return this.salesperson;
	}

	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(Integer totalamount) {
		this.totalamount = totalamount;
	}

	public String getUdid() {
		return this.udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserrole() {
		return this.userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getVoucher() {
		return this.voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public String getWallet() {
		return this.wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}