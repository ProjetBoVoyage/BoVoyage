package fr.adaming.service;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericCRUDDao;
import fr.adaming.model.Destination;

@Service("destService")
@Transactional
public class DestinationServiceImpl implements IDestinationService {
	
	//Transformation de l'asso UML en JAVA
	@Autowired
	IGenericCRUDDao<Destination> destDao;
	
	// Setter
	public void setDestDao(IGenericCRUDDao<Destination> destDao) {
		this.destDao = destDao;
	}

	@Override
	public Destination getById(int id) {
		return destDao.getById(id);
	}

	@Override
	public List<Destination> getAll() {
		return destDao.getAll();
	}

	@Override
	public Destination add(Destination destination) {
		return destDao.add(destination);
	}

	@Override
	public void update(Destination destination) {
		destDao.update(destination);
	}

	@Override
	public void delete(Destination destination) {
		destDao.delete(destination);
		
	}

}
