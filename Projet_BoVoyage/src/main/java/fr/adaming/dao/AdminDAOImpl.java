package fr.adaming.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Admin;

@Repository
public class AdminDAOImpl implements IClassDAO {

	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	@Override
	public Admin getAdminByMail(String mailAd) {
		// Open Session
		Session s = sf.getCurrentSession();
		// HQL Request
		String req = "FROM Admin AS ad WHERE ad.mailAd=:pMailAd";
		// Query object
		Query query = s.createQuery(req);
		// Parameters
		query.setParameter("pMailAd", mailAd);
		return (Admin) query.uniqueResult();
	}
}
