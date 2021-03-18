package com.example.demo.uss.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.uss.domain.UserDto;

// 둘다 인터페이스라 extends 사용한다.
public interface UserService extends UserDetailsService {
	public UserDto login(String username, String password);
}
