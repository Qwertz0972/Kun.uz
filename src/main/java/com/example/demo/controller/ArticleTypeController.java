package com.example.demo.controller;

import com.example.demo.dto.ArticleTypeDto;
import com.example.demo.model.ArticleType;
import com.example.demo.model.Result;
import com.example.demo.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articletype")
public class ArticleTypeController {

    @Autowired
    ArticleTypeService articleTypeService;

    //CREATE
    @PostMapping()
    public Result addArticleType(@RequestBody ArticleTypeDto articleTypeDto) {
        return articleTypeService.add(articleTypeDto);
    }

    @GetMapping()
    public List<ArticleType> getAllArticleTypes() {
        return articleTypeService.getAll();
    }

    @GetMapping("/{id}")
    public ArticleType getArticleTypeById(@PathVariable Long id) {
        return articleTypeService.getById(id);
    }

    @PutMapping("/{id}")
    public Result updateArticleType(@PathVariable Long id, @RequestBody ArticleTypeDto articleTypeDto) {
        return articleTypeService.edit(id, articleTypeDto);
    }

    @DeleteMapping("/{id}")
    public Result deleteArticleType(@PathVariable Long id) {
        return articleTypeService.delete(id);
    }
}
