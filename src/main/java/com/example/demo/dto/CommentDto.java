package com.example.demo.dto;

import com.example.demo.model.Article;
import com.example.demo.model.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDto {
    private Long profileId;
    private String content;
    private Long articleId;
}
