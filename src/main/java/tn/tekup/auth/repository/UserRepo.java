package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.auth.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
