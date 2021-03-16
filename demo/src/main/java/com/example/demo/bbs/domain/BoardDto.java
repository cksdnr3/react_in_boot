package com.example.demo.bbs.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardDto {
	private long boardNo;
	private String userId;
	private String password;
	private String userName;
	private String email;
}
