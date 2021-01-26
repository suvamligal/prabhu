package com.prabhubank.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

	private String username;
	private String password;
	private boolean active;
	
	private List<GrantedAuthority> authorities;

	//user can have multiple roles. so spliting the roles.
	public CustomUserDetails(Customer customer) {
		this.username = customer.getUsername();
		this.password = customer.getPassword();
		this.active = customer.isActive();
		this.authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_" + customer.getRoles()));

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
		 //return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
