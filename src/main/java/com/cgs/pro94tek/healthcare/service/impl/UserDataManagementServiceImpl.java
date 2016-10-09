package com.cgs.pro94tek.healthcare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Patientvoucher;
import com.cgs.pro94tek.healthcare.bean.User;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IUserDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.UserHelper;
import com.cgs.pro94tek.healthcare.modal.PatientVoucherModal;
import com.cgs.pro94tek.healthcare.modal.UserModal;
import com.cgs.pro94tek.healthcare.service.IUserDataManagementService;
import com.cgs.pro94tek.utils.CommonUtils;

@Service ("userDataManagementService")
public class UserDataManagementServiceImpl implements IUserDataManagementService {

	private static final Logger logger = LoggerFactory.getLogger(UserDataManagementServiceImpl.class);

	@Autowired	
	private IUserDAO userdao;

	@Override
	public UserModal authenticateUser(String username, String password) throws PMSException{
		/*
		 * Once complete application is pushed to Java use this until then use rest call to php call
		 */
		//User user = userDataAccessManager.authenticateUser(userid, password);
		UserModal userModal = new UserModal();
		try{
			String phppassword = CommonUtils.fetchUserPassword(username, password);

			logger.info("UserDataManagementServiceImpl : Password from Rest Call : "+phppassword);

			if(phppassword.trim()  != null &&  phppassword.trim()  != "Exception" && !phppassword.contains("Exception")){
				if( phppassword.trim() != null){
					User user = fetchUserInformation(username);

					UserHelper userHelper = new UserHelper();
					userModal = userHelper.createUserModal(user);
					userModal.setPassword(phppassword);

					if((phppassword.trim()).equals(password)){

						String token = null;

						logger.debug("Inside Equals : ");

						if(user.getUsername() != null && user.getUsername().length() > 1){

							logger.debug("Inside If Success : ");

							token = userdao.insertUserToken(user.getId(), user.getUsername(),user.getProfession(),String.valueOf(user.getOfficeid()));
							userModal.setToken(token);
							logger.debug("token  : "+token);

						}else{

							logger.debug("User Validation Failed. Unable to fetch User Details  : ");

							throw new PMSException(10,"User Validation Failed. Unable to fetch User Details");
						}

					}else{

						logger.debug("Password mismatch : ");

						throw new PMSException(10,"User Validation Failed. Password Mismatch.");
					}
				}else{

					logger.debug("In final If");

					throw new PMSException(10,"User Validation Failed. Invalid UserName and Password");
				}
			}else{

				logger.debug("In final If");

				throw new PMSException(10,"User Validation Failed. Invalid UserName and Password");
			}	
		}catch(Exception e){
			logger.error("Error : "+e.getMessage());
			e.printStackTrace();
			throw new PMSException(10,e);
		}
		return userModal;
	}

	@Override
	public User fetchUserInformation(String username) throws PMSException {
		// TODO Auto-generated method stub
		return userdao.fetchUserInformation(username);
	}

	@Override
	public List<PatientVoucherModal> fetchPatientVoucherDetails(Integer userid) throws PMSException {

		List<PatientVoucherModal> patientVoucherModal = new ArrayList<PatientVoucherModal>();
		PatientVoucherModal voucherModal = new PatientVoucherModal();

		List<Patientvoucher> patientVoucher = userdao.fetchPatientVoucherDetails(userid);

		UserHelper userHelper = new UserHelper();

		if(patientVoucher != null && patientVoucher.size() > 0){
			for(Patientvoucher voucher  : patientVoucher){
				if(voucher != null)
					voucherModal = userHelper.createPatientVoucherModal(voucher);

				patientVoucherModal.add(voucherModal);
				voucherModal = new PatientVoucherModal();
			}
		}


		return patientVoucherModal;
	}


}
