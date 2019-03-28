package fr.adaming.dao;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class GenericCRUDDaoImpl< T extends Serializable >
extends AbstractGenericCRUDDao< T > implements IGenericCRUDDao< T > {
	
}
