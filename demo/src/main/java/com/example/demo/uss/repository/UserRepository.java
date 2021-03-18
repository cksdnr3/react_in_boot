package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

// jpa안쓰고 내가 만들고 싶은 놈들 만드는 인터페이스
interface UserCustomRepository {
	
	public UserDto login(String username, String password);
}

// jpa 디폴트 메서드 인터페이스
public interface UserRepository extends JpaRepository<User, Long>,
										UserCustomRepository {
	public UserDto findByUsername(String username);
}
