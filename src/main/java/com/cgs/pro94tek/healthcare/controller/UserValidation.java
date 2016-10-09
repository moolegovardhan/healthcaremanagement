package com.cgs.pro94tek.healthcare.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;
import com.cgs.pro94tek.healthcare.service.IInventoryDataManagmentService;
import com.cgs.pro94tek.healthcare.service.IUserDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;
import com.cgs.pro94tek.utils.InventoryRequestResponse;
import com.cgs.pro94tek.utils.InventoryURIConstant;
import com.cgs.pro94tek.utils.ResponseMessages;

@Controller
public class UserValidation {
	
	
	@Autowired
	IUserDataManagementService userDataManagementService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserValidation.class);
	CommonUtils commonUtils = new CommonUtils();
	ResponseMessages message = new ResponseMessages();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	
	@RequestMapping(value = InventoryURIConstant.AUTHENTICATE_USER, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse authenticateUser(@PathVariable("username") String username,@PathVariable("password") String password) {
		
		logger.info("username . : "+username);logger.info("password . : "+password);
		UserModal userModal = new UserModal();
		
		try {
			  userModal = userDataManagementService.authenticateUser(username, password);
			  response = commonUtils.createResponseData(userModal.getName(), message.GENERALL_FETCH_SUCCESS, message.SUCCESS, "1", userModal);
			    
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());
			
			e.printStackTrace();
			response = commonUtils.createResponseData(userModal.getName(), message.GENERALL_EXCEPTION, message.FAIL, "1", e.getMessage());
		    
		}
		
		return response;
	}
	
	
	@RequestMapping(value = InventoryURIConstant.GET_PATIENT_VOUCHER_DETAILS, method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody InventoryRequestResponse fetchPatientVoucherDetails(@PathVariable("userid") String userid) {
		
		logger.info("userid . : "+userid);
		
		List<PatientVoucherModal> patientVoucherModal = new ArrayList<PatientVoucherModal>();
		
		try {
			patientVoucherModal = userDataManagementService.fetchPatientVoucherDetails(Integer.parseInt(userid));
			
			  response = commonUtils.createResponseData("Patient Voucher Details", message.GENERALL_FETCH_SUCCESS, message.SUCCESS, String.valueOf(patientVoucherModal.size()), patientVoucherModal);
			    
		} catch (PMSException e) {
			// TODO Auto-generated catch block
			logger.error(" In message Error"+e.getMessage());
			logger.error(" In cause Error"+e.getCause());
			
			e.printStackTrace();
			response = commonUtils.createResponseData("Exception in fetching Patient Voucher Details", message.GENERALL_EXCEPTION, message.FAIL, "0", e.getMessage());
		    
		}
		
		return response;
	}
	
	
	
		
}
