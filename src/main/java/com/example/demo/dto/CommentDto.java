package com.example.demo.dto;

import com.example.demo.model.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDto {
    private Profile profileId;
    private String content;
    private List<ArticleDto> articleId;
}
