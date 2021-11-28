package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.tekup.auth.model.Salle;

@RepositoryRestResource
public interface SalleRepo extends JpaRepository<Salle, Long> {

}
