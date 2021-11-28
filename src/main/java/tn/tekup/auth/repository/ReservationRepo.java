package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.tekup.auth.model.Reservation;

@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
