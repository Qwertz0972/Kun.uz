package com.example.demo.dto;

import com.example.demo.model.Category;
import com.example.demo.model.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDto {
    private String title;
    private String description;
    private String content;
    private Long sharedCount;
    private Long imageId;
    private Long regionId;
    private Category categoryId;
    private Long moderatorId;
    private Long publisherId;
    private String status;
    private String visible;
    private Long viewCount;
}
