package tn.tekup.auth.service;

import java.util.List;

import tn.tekup.auth.model.Proprietaire;

public interface ProprietaireService {
	
	List<Proprietaire> getAllProprietaire();
	Proprietaire saveOrUpdateProprietaire(Proprietaire proprietaire);
	void deleteProprietaire(Long id);

}
