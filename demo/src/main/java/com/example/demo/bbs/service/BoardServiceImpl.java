package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.bbs.domain.Board;
import com.example.demo.cmm.service.AbstractService;

@Service
public class BoardServiceImpl extends AbstractService<Board> {

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Board> findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board save(Board entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
