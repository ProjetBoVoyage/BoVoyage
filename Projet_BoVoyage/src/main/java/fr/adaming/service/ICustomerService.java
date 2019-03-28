package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Customer;

public interface ICustomerService {
	
	public Customer getById(final int id);
	
	public List<Customer> getAll();
	
	public int add(final Customer customer);
	
	public int update(final Customer customer);
	
	public int delete(final Customer customer);
	
}
