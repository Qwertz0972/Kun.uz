package com.example.demo.repository;

import com.example.demo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleSavedRepository extends JpaRepository<Article, Long> {
}
