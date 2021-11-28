package tn.tekup.auth.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.tekup.auth.model.Proprietaire;
import tn.tekup.auth.service.ProprietaireService;

@RestController
@RequestMapping("/proprietiare")
public class ProprietaireController {
	
	@Autowired
	private ProprietaireService proprietaireService;
	
	@GetMapping
	public List<Proprietaire> getAll(){
		return proprietaireService.getAllProprietaire();	
	}
	
	@PostMapping
	public Proprietaire savePropprietaire(@RequestBody Proprietaire proprietaire) {
		return proprietaireService.saveOrUpdateProprietaire(proprietaire);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProprietaire(@PathVariable Long id) {
		proprietaireService.deleteProprietaire(id);
	}

}
