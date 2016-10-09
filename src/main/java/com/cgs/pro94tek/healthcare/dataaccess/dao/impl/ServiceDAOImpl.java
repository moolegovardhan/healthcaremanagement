package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cgs.pro94tek.healthcare.bean.Services;
import com.cgs.pro94tek.healthcare.dataaccess.dao.IServiceDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;

@Repository("serviceDAO")
public class ServiceDAOImpl extends CustomHibernateDaoSupport implements IServiceDAO{

	@SuppressWarnings("unchecked")
	@Transactional
	public Services getServiceByName(String serviceName) throws DataAccessException {
		Services service = null;
		String queryServiceByName = "from Services where serviceName = :serviceName";
		Query query = getSession().createQuery(queryServiceByName);
		query.setParameter("serviceName", serviceName);
		List<Services> services = query.list();
		if (PmsUtil.isCollectionNotEmpty(services)) {
			service = services.get(0);
		}
		return service;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Services> fetchServiceById(String serviceId) throws DataAccessException {
		 List<Services> service = new ArrayList<Services>();
			String queryeserviceById  = "from Services where officeid = :serviceId";
			Query query = getSession().createQuery(queryeserviceById);
			query.setParameter("serviceId",(serviceId));
			List<Services> services = query.list();
			if (PmsUtil.isCollectionNotEmpty(services)) {
				return services;
			}else{
				return service;
			}
	}

	@Override
	@Transactional
	public void createOrUpdateService(Services service) throws DataAccessException {
	getSession().saveOrUpdate(service);
		
	}

	@Override
	@Transactional
	public boolean deleteServiceById(String serviceId) throws DataAccessException {
		String queryserviceId = " Delete from Services where id = :serviceId";
		Query query = getSession().createQuery(queryserviceId);
		query.setParameter("serviceId", Long.parseLong(serviceId));
		query.executeUpdate();
		return true;
	}
	
	

}
