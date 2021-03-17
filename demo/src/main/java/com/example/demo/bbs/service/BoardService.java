package com.example.demo.bbs.service;

import java.util.Optional;

import org.springframework.data.domain.Example;

public interface BoardService {
	public Iterable<Long> findAll();
	public long count();
	public void deleteById(long id);
	public boolean existsById(long id);
	public Optional<Long> findById(long id);
	public <Board> Optional<Board> findOne(Example<Board> example);
	public <Board> Board save(Board entity);
}
