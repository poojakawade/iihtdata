package com.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// find user from database where user = :username
// userRepo.findByUsername(username);// username, password, roles
		if ("demo".equals(username)) {
			return new User(
					"demo",
//					"{noop}demo@123",
					"$2a$10$8UF9hESyLif7TmNIJP5jRuGNirYrPr5HN7EwYwrCEuHY8lVjGlywa",
					new ArrayList());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}