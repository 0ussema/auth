package tn.tekup.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import tn.tekup.auth.model.User;
import tn.tekup.auth.service.AcountService;

@RestController
public class UserController {
	
	@Autowired
	private AcountService acountService;

	@PostMapping("/register")
	public User registre(@RequestBody UserForm userForm) {
		return acountService.saveUser(userForm.getUsername(), userForm.getPassword(), userForm.getConfirmedPassword());
	}
	
	}

@Data
class UserForm{
	private String username;
	private String password;

	private String confirmedPassword;
}

