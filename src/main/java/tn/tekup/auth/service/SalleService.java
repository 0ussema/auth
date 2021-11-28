package tn.tekup.auth.service;

import java.util.List;

import tn.tekup.auth.model.Salle;

public interface SalleService {
	
	List<Salle> getAllSalles();
	Salle saveOrUpdateSalle(Salle salle);
	void deleteSalle(Long id);

}
