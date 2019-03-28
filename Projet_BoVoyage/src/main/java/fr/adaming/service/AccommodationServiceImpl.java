package fr.adaming.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IAccommodationDao;
import fr.adaming.model.Accommodation;

@Service
@Transactional
public class AccommodationServiceImpl implements IAccommodationService{

	IAccommodationDao accomDao;
	
	public void setDao(IAccommodationDao daoToSet) {
		accomDao = daoToSet;
		accomDao.setClazz(Accommodation.class);
	}
	@Override
	public Accommodation getById(int id) {
		return accomDao.findOne(id);
	}

	@Override
	public List<Accommodation> getAll() {
		return accomDao.findAll();
	}

	@Override
	public int add(Accommodation accommodation) {
		return accomDao.create(accommodation);
	}

	@Override
	public int update(Accommodation accommodation) {
		return accomDao.update(accommodation);
	}

	@Override
	public int delete(Accommodation accommodation) {
		return accomDao.delete(accommodation);
	}

}
