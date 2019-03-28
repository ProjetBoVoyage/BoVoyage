package fr.adaming.dao;

import fr.adaming.model.Admin;

public interface IPersonDAO {

	public Admin getAdminByMail(String mailAd);
	
}
