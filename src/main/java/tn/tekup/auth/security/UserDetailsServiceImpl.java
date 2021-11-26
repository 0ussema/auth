package tn.tekup.auth.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.tekup.auth.model.User;
import tn.tekup.auth.service.AcountService;

@Service 
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private AcountService acountService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = acountService.loadUserByUsername(username);
		if(user == null) throw new UsernameNotFoundException("invalid user");
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		user.getRoles().forEach(r -> { 
				authorities.add(new SimpleGrantedAuthority(r.getRoleName())); 
			});
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities) ;
	}

}
