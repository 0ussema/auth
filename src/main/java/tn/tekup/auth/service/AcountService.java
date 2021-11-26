package tn.tekup.auth.service;

import java.util.List;

import tn.tekup.auth.model.Role;
import tn.tekup.auth.model.User;

public interface AcountService {
	
	User saveUser(String username, String password, String confirmedPassword);
	Role saveRole(Role role);
	User loadUserByUsername(String username);
	void addRoleToUser(String username, String rolename);
	
	List<User> getAllUsers();

}
