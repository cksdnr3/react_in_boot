package com.example.demo.uss.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface UserService {
	
	public long count();
	public List<T> findAll();
	public List<T> findAll(Sort sort);
	List<Long> findAllById(Iterable<Long> ids);
	public<S extends T> List<S> saveAll(Iterable<S> entities);
	public void flush();
	public Long getOne(Long id);
}