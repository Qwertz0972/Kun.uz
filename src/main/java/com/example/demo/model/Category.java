package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long ordernumber;
    @Column(nullable = false)
    private String nameuz;
    @Column(nullable = false)
    private String nameru;
    @Column(nullable = false)
    private String nameeng;
    @Column(nullable = false)
    private String visible;
    @Column(nullable = false)
    private Date createdDate;
}