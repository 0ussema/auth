package tn.tekup.auth.service;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.tekup.auth.model.Role;
import tn.tekup.auth.model.User;
import tn.tekup.auth.repository.RoleRepo;
import tn.tekup.auth.repository.UserRepo;

@Service
@Transactional
public class AcountServiceImpl implements AcountService {
	
	private UserRepo userRepo;
	private RoleRepo roleRepo;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	

	public AcountServiceImpl(UserRepo userRepo, RoleRepo roleRepo,BCryptPasswordEncoder bCryptPasswordEncoder ) {
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public User saveUser(String username, String password, String confirmedPassword) {
		User user = userRepo.findByUsername(username);
		if (user != null) throw new RuntimeException("user already exists");
		if (!password.equals(confirmedPassword)) throw new RuntimeException("please confirm your password");
		User appUser = new User();
		appUser.setUsername(username);
		appUser.setPassword(bCryptPasswordEncoder.encode(password));
		appUser.setActived(true);
		userRepo.save(appUser);
		addRoleToUser(username, "USER");
		return appUser;
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public User loadUserByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByRoleName(rolename);
		user.getRoles().add(role);	

	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
