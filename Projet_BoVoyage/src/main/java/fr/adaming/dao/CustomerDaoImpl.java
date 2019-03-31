package fr.adaming.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Customer;

@Repository
public class CustomerDaoImpl extends AbstractGenericDao<Customer> implements ICustomerDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public Customer getCustomerById(int id) {
		Session s = sf.getCurrentSession();

		// hql
		String req = "FROM Person p WHERE p.id=:pId";

		Query query = s.createQuery(req);

		query.setParameter("pId", id);

		return (Customer) query.uniqueResult();

	}
}
