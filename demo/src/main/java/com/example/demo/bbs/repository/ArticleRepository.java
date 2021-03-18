package com.example.demo.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bbs.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
