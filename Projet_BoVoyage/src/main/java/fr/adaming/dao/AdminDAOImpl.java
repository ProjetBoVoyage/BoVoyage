package fr.adaming.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Admin;

@Repository
public class AdminDAOImpl implements IAdminDAO {

	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Admin getAdminByMail(String mail) {
		// Open Session
		Session s = sf.getCurrentSession();
		// HQL Request
		String req = "FROM Person AS p WHERE p.mail=:pMail";
		// Query object
		Query query = s.createQuery(req);
		// Parameters
		query.setParameter("pMail", mail);
		return (Admin) query.uniqueResult();
	}
}
