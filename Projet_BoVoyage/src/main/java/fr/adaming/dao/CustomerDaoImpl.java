package fr.adaming.dao;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Customer;

@Repository
public class CustomerDaoImpl extends AbstractGenericDao<Customer> implements ICustomerDao {

}
