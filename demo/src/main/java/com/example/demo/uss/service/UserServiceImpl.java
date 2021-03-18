package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

	@Autowired
	UserRepository repo;

	// 상속받은 UserDetailsService의 메서드의 구현
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserDto user = repo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
		} else {
			return user;
		}
	}

	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public boolean existsById(long id) {

		return repo.existsById(id);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<User> findOne() {
		return repo.findOne(null);
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public User getOne(long id) {
		return repo.getOne(id);
	}

	@Override
	public User save(User entity) {
		return repo.save(entity);
	}

	@Override
	public UserDto login(String username, String password) {
		return repo.login(username, password);
	}
}
