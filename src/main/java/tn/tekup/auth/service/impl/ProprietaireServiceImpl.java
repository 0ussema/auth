package tn.tekup.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.auth.model.Proprietaire;
import tn.tekup.auth.repository.ProprietaireRepo;
import tn.tekup.auth.service.ProprietaireService;

@Service
public class ProprietaireServiceImpl implements ProprietaireService {

	@Autowired
	private ProprietaireRepo  proprietaireRepo;
	
	@Override
	public List<Proprietaire> getAllProprietaire() {
		return proprietaireRepo.findAll();
	}

	@Override
	public Proprietaire saveOrUpdateProprietaire(Proprietaire proprietaire) {
		return proprietaireRepo.save(proprietaire);
	}

	@Override
	public void deleteProprietaire(Long id) {
		proprietaireRepo.deleteById(id);
		
	}

}
