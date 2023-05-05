package com.example.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Pcelar;
import com.example.service.repository.BeekeeperRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	
	 @Autowired
	 private BeekeeperRepository br;


	 @Override
	 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		 Pcelar beekeeper = br.findByUsername(username);

		 if (beekeeper != null) {

			 return beekeeper;
			 
		 }else{
		    throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
		 }
		
	 }
	
}
