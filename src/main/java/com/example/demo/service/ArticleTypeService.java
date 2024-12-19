package com.example.demo.service;

import com.example.demo.dto.ArticleTypeDto;
import com.example.demo.model.ArticleType;
import com.example.demo.model.Result;
import com.example.demo.repository.ArticleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleTypeService {

    @Autowired
    ArticleTypeRepository articleTypeRepository;

    public Result add(ArticleTypeDto articleTypeDto) {
        ArticleType articleType = new ArticleType();

        articleType.setOrderNumber(articleTypeDto.getOrderNumber());
        articleType.setNameUz(articleTypeDto.getNameUz());
        articleType.setNameRu(articleTypeDto.getNameRu());
        articleType.setNameEng(articleTypeDto.getNameEng());
        articleType.setVisible(articleTypeDto.getVisible());

        articleTypeRepository.save(articleType);

        return new Result(true,"Article Type Created Succesfully");
    }

    public List<ArticleType> getAll(){
        return articleTypeRepository.findAll();
    }

    public ArticleType getById(Long id){
        return articleTypeRepository.findById(id).get();
    }

    public Result edit(Long id,ArticleTypeDto articleTypeDto) {
        Optional<ArticleType> articleTypeOptional = articleTypeRepository.findById(id);
        if(articleTypeOptional.isPresent()){
            ArticleType articleType = articleTypeOptional.get();

            articleType.setOrderNumber(articleTypeDto.getOrderNumber());
            articleType.setNameUz(articleTypeDto.getNameUz());
            articleType.setNameRu(articleTypeDto.getNameRu());
            articleType.setNameEng(articleTypeDto.getNameEng());
            articleType.setVisible(articleTypeDto.getVisible());

            articleTypeRepository.save(articleType);

            return new Result(true,"Article Type Edited Succesfully");
        }
        return new Result(false,"Article Type Not Found");
    }

    public Result delete(Long id){
        articleTypeRepository.deleteById(id);
        return new Result(true,"Article Type Deleted Succesfully");
    }
}
