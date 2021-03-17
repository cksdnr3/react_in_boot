package com.example.demo.bbs.service;

import java.util.Optional;

import org.springframework.data.domain.Example;

public interface ArticleService {
	public Iterable<Long> findAll();
	public long count();
	public void deleteById(long id);
	public boolean existsById(long id);
	public Optional<Long> findById(long id);
	public <Article> Optional<Article> findOne(Example<Article> example);
	public <Article> Article save(Article entity);
}
