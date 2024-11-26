package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileDto {
    private String firstname;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private String status;
    private String role;
    private String visible;
    private Date creted_date;
    private Integer photo_id;
}
