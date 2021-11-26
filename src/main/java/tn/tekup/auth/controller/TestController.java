package tn.tekup.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.tekup.auth.model.User;
import tn.tekup.auth.service.AcountService;

@RestController
public class TestController {

	@Autowired
	private AcountService acountService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return acountService.getAllUsers();
	}
}
