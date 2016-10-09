package com.cgs.pro94tek.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgs.pro94tek.healthcare.bean.Charge;
import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IChargeDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceDAO;
import com.cgs.pro94tek.healthcare.exeception.PMSException;
import com.cgs.pro94tek.healthcare.helper.ChargeHelper;
import com.cgs.pro94tek.healthcare.helper.ServiceHelper;
import com.cgs.pro94tek.healthcare.modal.ServiceModal;
import com.cgs.pro94tek.healthcare.service.IServiceDataManagmentService;

@Service("serviceDataManagementService")
public class ServicesDataRetrivalServiceImpl implements IServiceDataManagmentService{
	
	@Autowired
	private IServiceDAO servicedao;

	@Override
	public List<ServiceModal> fetchServiceById(String serviceId) throws PMSException {
		List<Services> service = servicedao.fetchServiceById(serviceId);
		ServiceHelper servicehelper = new ServiceHelper();
		return servicehelper.createserviceModal(service);
	}

	@Override
	public ServiceModal fetchServiceDetails(String taserviceIdxId) throws PMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Services fetchServiceByName(String serviceName) throws PMSException {
		return servicedao.getServiceByName(serviceName);
	}

	@Override
	public void createOrUpdateService(Services serviceEntity) throws PMSException {
		servicedao.createOrUpdateService(serviceEntity);
		
	}

	@Override
	public boolean deleteServiceById(String serviceId) throws PMSException {
		
		return deleteServiceById(serviceId);
	}

}
