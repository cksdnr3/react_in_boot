package com.example.demo.sec.domain;

import java.util.Base64;
import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class JwtTokenProvider {
	@Value("spring.jwt.secret") // 외부 데이터 yml에 있는 jwt scret을 가지고 올 수 있도록 해준다. jwt는 토큰 키라고 보면된다.
	private String SECRET_KEY;

	private long tokenValidMilisecond = 1000L * 60 * 60; // 1시간만 토큰 유효

	private final UserDetailsService userDetailsService;

	@PostConstruct
	protected void init() {
		// 64진수 키를 발굴한다.
		SECRET_KEY = Base64.getEncoder().encodeToString(SECRET_KEY.getBytes());
	}
	// 권한은 여러개가 있다. 즉 권한 마다 토큰이 있는데 여러개이기 때문에 collection을 사용한다.
	public String createToken(String userPk, Collection<? extends GrantedAuthority> roles) {
		Claims claims = Jwts.claims().setSubject(userPk); // userid로 claim생성 메서드 참조
		claims.put("roles", roles); // JSON
		Date now = new Date();
		
		return Jwts.builder()
				.setClaims(claims) // 아이디 하나 주고
				.setIssuedAt(now)
				.setExpiration(new Date(now.getTime() + tokenValidMilisecond)) // 시간 하나주고
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY) // 랜덤 키 만듬
				.compact(); // 압축
	}
}
