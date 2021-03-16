package com.example.demo.bbs.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ArticleDto {
	private long articleNo;
	private long userNo;
	private String content;
	private String title;
	private String regdate;
}
