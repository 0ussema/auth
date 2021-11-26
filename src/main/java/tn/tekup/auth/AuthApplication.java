package tn.tekup.auth;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import tn.tekup.auth.model.Role;
import tn.tekup.auth.model.User;
import tn.tekup.auth.service.AcountService;


@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
/*	@Bean
	CommandLineRunner run(AcountService acountService) {
		return args ->{
			acountService.saveRole(new Role(null, "USER"));
			acountService.saveRole(new Role(null, "MANAGER"));
			acountService.saveRole(new Role(null, "ADMIN"));
			
			Stream.of("user1" ,"user2", "user3","admin").forEach(un -> {acountService.saveUser(un, "1234", "1234");});
			
			acountService.addRoleToUser("admin", "ADMIN");
		};
		
	}*/
			
		

}
