package com.dk.sbs.api.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dk.sbs.api.model.User;
import com.dk.sbs.api.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService{
	private UserRepository userRepository;

	/*@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findbyusername(username);
		CustomUserDetail userDetail=null;
		if(user!=null) {
			userDetail=new CustomUserDetail();
			userDetail.setUser(user);
			
		}else {
			throw new UsernameNotFoundException("user name not exist "+username);
		}
		return null;
	}*/
	
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		CustomUserDetail userDetails = null;
		if (user != null) {
			userDetails = new CustomUserDetail();
			userDetails.setUser(user);
		} else {
			throw new UsernameNotFoundException("User not exist with name : " + username);
		}
		return userDetails;

	}

}
