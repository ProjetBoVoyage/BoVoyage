package fr.adaming.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractGenericCRUDDao < T extends Serializable > {
	
	// Attributes
	private Class< T > classe;

	@Autowired
	private SessionFactory sf;

	// Getters & Setters
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public Class<T> getClasse() {
		return classe;
	}

	public void setClasse(Class<T> classe) {
		this.classe = classe;
	}

	// Methods
	
	  @SuppressWarnings("unchecked")
	public T getById(int id ){
	      return (T) getCurrentSession().get(classe, id );
	   }
	   @SuppressWarnings("unchecked")
	public List< T > getAll(){
	      return getCurrentSession().createQuery( "FROM " +classe.getName() ).list();
	   }
	 
	   public T add( T entity ){
	      getCurrentSession().persist( entity );
		return entity;
	   }
	 
	   public void update( T entity ){
	      getCurrentSession().merge( entity );
	   }
	 
	   public void delete( T entity ){
	      getCurrentSession().delete( entity );
	   }
	
	   protected final Session getCurrentSession() {
		      return sf.getCurrentSession();
		   }
}
