package tn.tekup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.auth.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	
	Role findByRoleName(String roleName);

}
