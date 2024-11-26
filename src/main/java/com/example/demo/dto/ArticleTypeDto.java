package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleTypeDto {
    private Long ordernumber;
    private String nameuz;
    private String nameru;
    private String nameeng;
    private String visible;
    private Date createdDate;
}
