package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDto {
    private Long orderNumber;
    private String nameUz;
    private String nameRu;
    private String nameEng;
    private String visible;
}
