package com.cgs.pro94tek.healthcare.modal;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class UserModal implements Serializable {
	
	
	private static final long serialVersionUID = 5249527557527343826L;
	
	
	public int id = 1;
	public String aadharcard;
	private String address;
	private String addressline1;
	private String addressline2;
	private int age;
	private String altmobile;
	private String cardamount;
	private Date cardexpiry;
	private String cardtype;
	private String city;
	private String createdby;
	private Date createddate;
	private int credits;
	private String department;
	private String district;
	private Date dob;
	private String doctorid;
	private String email;
	private String firstname;
	private String gender;
	private String insttype;
	private String landline;
	private String lastname;
	private String middlename;
	private String mobile;
	private String name;
	private int officeid;
	private int otp;
	private String password;
	private String patientuniqueid;
	private String policyid;
	private String policytype;
	private String profession;
	private String quickregister;
	private String registeredfrom;
	private String salesperson;
	private String state;
	private String status;
	private int totalamount;
	private String udid;
	private String username;
	private String userrole;
	private String voucher;
	private String wallet;
	private String zipcode;
	private String token;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAltmobile() {
		return altmobile;
	}
	public void setAltmobile(String altmobile) {
		this.altmobile = altmobile;
	}
	public String getCardamount() {
		return cardamount;
	}
	public void setCardamount(String cardamount) {
		this.cardamount = cardamount;
	}
	public Date getCardexpiry() {
		return cardexpiry;
	}
	public void setCardexpiry(Date cardexpiry) {
		this.cardexpiry = cardexpiry;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInsttype() {
		return insttype;
	}
	public void setInsttype(String insttype) {
		this.insttype = insttype;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPatientuniqueid() {
		return patientuniqueid;
	}
	public void setPatientuniqueid(String patientuniqueid) {
		this.patientuniqueid = patientuniqueid;
	}
	public String getPolicyid() {
		return policyid;
	}
	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getQuickregister() {
		return quickregister;
	}
	public void setQuickregister(String quickregister) {
		this.quickregister = quickregister;
	}
	public String getRegisteredfrom() {
		return registeredfrom;
	}
	public void setRegisteredfrom(String registeredfrom) {
		this.registeredfrom = registeredfrom;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getUdid() {
		return udid;
	}
	public void setUdid(String udid) {
		this.udid = udid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getVoucher() {
		return voucher;
	}
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
