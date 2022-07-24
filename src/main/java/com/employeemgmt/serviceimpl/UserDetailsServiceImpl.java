package com.employeemgmt.serviceimpl;

	import com.employeemgmt.model.*;
	import com.employeemgmt.repository.UserRepository;
	import com.employeemgmt.security.CUserDetails;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.core.userdetails.UserDetails;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.core.userdetails.UsernameNotFoundException;
	
	public class UserDetailsServiceImpl implements UserDetailsService {
	
		@Autowired
		private com.employeemgmt.repository.UserRepository userRepository;
	
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUserName(username);
			if (user == null) {
				System.out.println("Could not find user..." + username);
				throw new AccountNotFoundException("Could not find user");
		}
		return newCUserDetails(user);
	}

}
