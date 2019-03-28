package fr.adaming.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericCRUDDao<T extends Serializable> {
		 
		   public T getById(final int id);
		 
		   public List<T> getAll();
		 
		   public T add(final T entity);
		 
		   public void update(final T entity);
		 
		   public void delete(final T entity);
		 
		}

