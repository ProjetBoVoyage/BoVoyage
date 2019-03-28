package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Destination;

public interface IDestinationService {
	
	   public Destination getById(final int id);
		 
	   public List<Destination> getAll();
	 
	   public void add(final Destination destination);
	 
	   public void update(final Destination destination);
	 
	   public void delete(final Destination destination);

}
