package com.example.demo.repository;

import com.example.demo.model.ArticleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTypeRepository extends JpaRepository<ArticleType,Long>{
}
