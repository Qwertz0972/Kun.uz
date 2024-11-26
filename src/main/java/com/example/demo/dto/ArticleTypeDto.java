package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleTypeDto {
    private Long orderNumber;
    private String nameUz;
    private String nameRu;
    private String nameEng;
    private String visible;
}
