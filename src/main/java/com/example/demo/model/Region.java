package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long orderNumber;
    @Column(nullable = false)
    private String nameUz;
    @Column(nullable = false)
    private String nameRu;
    @Column(nullable = false)
    private String nameEng;
    @Column(nullable = false)
    private String visible;
    @Column(nullable = false)
    private Date createdDate;
}
