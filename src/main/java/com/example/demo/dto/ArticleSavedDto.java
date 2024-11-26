package com.example.demo.dto;

import com.example.demo.model.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleSavedDto {
    private Profile profileId;
    private Long articleId;
}
