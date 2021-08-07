package com.UJC.bolsa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.UJC.bolsa.domain.User;
import com.UJC.bolsa.domain.UserPrincipal;
import com.UJC.bolsa.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = repository.findByUsername(username);
			if(user == null) {
				throw new UsernameNotFoundException("Usuario nao encontrado");
			}
			
			return new UserPrincipal(user);
	}

}
