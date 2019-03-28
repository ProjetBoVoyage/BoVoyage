package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IAdminDAO;
import fr.adaming.model.Admin;

@Service("adService")
@Transactional
public class AdminServiceImpl implements IAdminService {

	// UML to Java Association's Transformation
	@Autowired
	private IAdminDAO adDAO;
	
	// Setter for Dependency Injection
	public void setAdDAO(IAdminDAO adDAO) {
		this.adDAO = adDAO;
	}

	@Override
	public Admin getAdminByMail(String mail) {
		// Calling DAO Method
		return adDAO.getAdminByMail(mail);
	}

	
	
}
