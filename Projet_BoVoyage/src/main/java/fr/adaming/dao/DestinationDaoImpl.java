package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Destination;

@Repository
public class DestinationDaoImpl extends AbstractGenericDao<Destination> implements IDestinationDao{
	

	@Autowired
	private SessionFactory sf;

	// Le setter pour l'injection de d�pendance
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	@Override
	public List<Destination> getDestinationByContinent(String continent) {
		Session s = sf.getCurrentSession();

		// Requ�te HQL
		String req = "FROM Destination as d WHERE d.continent=:pCont";

		// R�cup�rer un objet de type Query
		Query query = s.createQuery(req);

		// Param�tres
		query.setParameter("pCont", continent);

		@SuppressWarnings("unchecked")
		List<Destination> listeDest = query.list();

		return listeDest;

	}


}
