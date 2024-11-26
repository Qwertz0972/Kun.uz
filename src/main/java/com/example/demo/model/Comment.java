package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    private Date createdDate;
    @CreatedDate
    private Date updatedDate;
    @ManyToOne
    private Profile profileId;
    @Column(nullable = false)
    private String content;
    @ManyToMany
    private List<Comment>  articleId;
    @Column(nullable = false)
    private Long replyId;
    @Column(nullable = false)
    private String visible;
}
