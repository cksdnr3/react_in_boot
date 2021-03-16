package com.example.demo.bbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Article {
	
	@Id
	@GeneratedValue
	@Column(name="article_no")
	private long articleNo;
	
	@Column(name="user_no")
	private long userNo;
	
	@Column(name="content")
	private String content;
	
	@Column(name="title")
	private String title;
	
	@Column(name="regdate")
	private String regdate;
}
