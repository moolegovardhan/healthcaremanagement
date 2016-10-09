package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.cgs.pro94tek.healthcare.bean.Services;

public interface IServiceDAO {
	
	public Services getServiceByName(String serviceName) throws DataAccessException;
	public List<Services> fetchServiceById(String serviceId)throws DataAccessException;
	public void createOrUpdateService(Services service)throws DataAccessException;
	public boolean deleteServiceById(String serviceId) throws DataAccessException;

}
