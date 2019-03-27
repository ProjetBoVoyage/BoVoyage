package fr.adaming.dao;

import fr.adaming.model.Admin;

public interface IAdminDAO {

	public Admin getAdminByMail(String mailAd);
	
}
