package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.tekup.auth.model.Proprietaire;
@RepositoryRestResource
public interface ProprietaireRepo extends JpaRepository<Proprietaire, Long> {

}
