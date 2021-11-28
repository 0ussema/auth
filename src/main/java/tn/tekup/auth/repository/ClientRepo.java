package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.tekup.auth.model.Client;

@RepositoryRestResource
public interface ClientRepo extends JpaRepository<Client, Long> {

}
