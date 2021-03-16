package com.example.demo.bbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boards")
public class Board {
	
	@Id
	@GeneratedValue
	@Column(name="board_no")
	private long boardNo;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email")
	private String email;
}
