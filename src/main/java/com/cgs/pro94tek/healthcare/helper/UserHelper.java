package com.cgs.pro94tek.healthcare.helper;

import com.cgs.pro94tek.healthcare.bean.Patientvoucher;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;

public class UserHelper {
	
	
	public UserModal createUserModal(User user){
		
		UserModal userModal = new UserModal();
		if(user.getAadharcard() != null)
		userModal.setAadharcard(user.getAadharcard());
		if(user.getAddress() != null)
		userModal.setAddress(user.getAddress());
		if(user.getAddressline1() != null)
		userModal.setAddressline1(user.getAddressline1());
		if(user.getAddressline2() != null)
		userModal.setAddressline2(user.getAddressline2());
		if(user.getAge() != null)
		userModal.setAge(user.getAge());
		if(user.getAltmobile() != null)
		userModal.setAltmobile(user.getAltmobile());
		if(user.getCardamount() != null)
		userModal.setCardamount(user.getCardamount());
		if(user.getCardexpiry() != null)
		userModal.setCardexpiry(user.getCardexpiry());
		if(user.getCardtype() != null)
		userModal.setCardtype(user.getCardtype());
		if(user.getCity() != null)
		userModal.setCity(user.getCity());
		if(user.getCreatedby() != null)
		userModal.setCreatedby(user.getCreatedby());
		if(user.getCreateddate() != null)
		userModal.setCreateddate(user.getCreateddate());
		if(user.getCredits() != null)
		userModal.setCredits(user.getCredits());
		if(user.getDepartment() != null)
		userModal.setDepartment(user.getDepartment());
		if(user.getDistrict() != null)
		userModal.setDistrict(user.getDistrict());
		if(user.getDoctorid() != null)
		userModal.setDoctorid(user.getDoctorid());
		if(user.getEmail() != null)
		userModal.setEmail(user.getEmail());
		if(user.getFirstname() != null)
		userModal.setFirstname(user.getFirstname());
		if(user.getZipcode() != null)
		userModal.setZipcode(user.getZipcode());
		if(user.getWallet() != null)
		userModal.setWallet(user.getWallet());
		if(user.getVoucher() != null)
		userModal.setVoucher(user.getVoucher());
		if(user.getUsername() != null)
		userModal.setUsername(user.getUsername());
		if(user.getUdid() != null)
		userModal.setUdid(user.getUdid());
		if(user.getTotalamount() != null)
			userModal.setTotalamount(user.getTotalamount());
		if(user.getSalesperson() != null)
		userModal.setSalesperson(user.getSalesperson());
		if(user.getState() != null)
		userModal.setState(user.getState());
		if(user.getStatus() != null)
		userModal.setStatus(user.getStatus());
		if(user.getGender() != null)
		userModal.setGender(user.getGender());
		userModal.setId(user.getId());
		if(user.getInsttype() != null)
		userModal.setInsttype(user.getInsttype());
		if(user.getRegisteredfrom() != null)
		userModal.setRegisteredfrom(user.getRegisteredfrom());
		if(user.getQuickregister() != null)
		userModal.setQuickregister(user.getQuickregister());
		if(user.getPassword() != null)
		userModal.setPassword(user.getPassword());
		if(user.getPatientuniqueid() != null)
		userModal.setPatientuniqueid(user.getPatientuniqueid());
		if(user.getPolicyid() != null)
		userModal.setPolicyid(user.getPolicyid());
		if(user.getPolicytype() != null)
		userModal.setPolicytype(user.getPolicytype());
		if(user.getProfession() != null)
		userModal.setProfession(user.getProfession());
		if(user.getLandline() != null)
		userModal.setLandline(user.getLandline());
		if(user.getLastname() != null)
		userModal.setLastname(user.getLastname());
		if(user.getMiddlename() != null)
		userModal.setMiddlename(user.getMiddlename());
		if(user.getMobile() != null)
		userModal.setMobile(user.getMobile());
		if(user.getName() != null)
		userModal.setName(user.getName());
		if(user.getOfficeid() != null)
			userModal.setOfficeid(user.getOfficeid());
		if(user.getOtp() != null)
			userModal.setOtp(user.getOtp());
		return userModal;
	}
	
	public PatientVoucherModal createPatientVoucherModal(Patientvoucher patientVoucher){
		PatientVoucherModal patientVoucherModal = new PatientVoucherModal();
		
		if(patientVoucher.getCardtype() != null)
			patientVoucherModal.setCardtype(patientVoucher.getCardtype());
		if(patientVoucher.getCreatedate() != null)
			patientVoucherModal.setCreatedate(patientVoucher.getCreatedate());
		if(patientVoucher.getCreatedby() != null)
			patientVoucherModal.setCreatedby(patientVoucher.getCreatedby());
		if(patientVoucher.getExpirydate() != null)
			patientVoucherModal.setExpirydate(patientVoucher.getExpirydate());
		if(patientVoucher.getId() != null)
			patientVoucherModal.setId(String.valueOf(patientVoucher.getId()));
		if(patientVoucher.getInsttype() != null)
			patientVoucherModal.setInsttype(patientVoucher.getInsttype());
		if(patientVoucher.getPatientid() != null)
			patientVoucherModal.setPatientid(patientVoucher.getPatientid());
		if(patientVoucher.getPercent() != null)
			patientVoucherModal.setPercent(patientVoucher.getPercent());
		if(patientVoucher.getStatus() != null)
			patientVoucherModal.setStatus(patientVoucher.getStatus());
		if(patientVoucher.getVouchercount() != null)
			patientVoucherModal.setVouchercount(patientVoucher.getVouchercount());
		if(patientVoucher.getVouchername() != null)
			patientVoucherModal.setVouchername(patientVoucher.getVouchername());
		
		return patientVoucherModal;
	}

}
