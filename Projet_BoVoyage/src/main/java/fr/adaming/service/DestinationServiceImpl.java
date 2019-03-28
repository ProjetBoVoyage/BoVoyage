package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IDestinationDao;

import fr.adaming.model.Destination;

@Service
@Transactional
public class DestinationServiceImpl implements IDestinationService {


	IDestinationDao destDao;

	@Autowired
	public void setDao(IDestinationDao daoToSet) {
		destDao = daoToSet;
		destDao.setClazz(Destination.class);
	}

	@Override
	public Destination getById(int id) {
		return destDao.findOne(id);
	}

	@Override
	public List<Destination> getAll() {
		return destDao.findAll();
	}

	@Override
	public void add(Destination destination) {
		destDao.create(destination);
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