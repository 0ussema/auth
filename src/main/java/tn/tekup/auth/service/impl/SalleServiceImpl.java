package tn.tekup.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.auth.model.Salle;
import tn.tekup.auth.repository.SalleRepo;
import tn.tekup.auth.service.SalleService;

@Service
public class SalleServiceImpl implements SalleService{

	@Autowired
	private SalleRepo salleRepo;
	@Override
	public List<Salle> getAllSalles() {
		return salleRepo.findAll();
	}

	@Override
	public Salle saveOrUpdateSalle(Salle salle) {
		return salleRepo.save(salle);
	}

	@Override
	public void deleteSalle(Long id) {
		salleRepo.deleteById(id);
		
	}

}
