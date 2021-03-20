package com.example.demo.uss.domain;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@Column(name = "user_no")
	@GeneratedValue(strategy = GenerationType.AUTO) // 자동증가
	private long userNo;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "birthday")
	private String birthday;

	@Column(name = "gender")
	private String gender;
}