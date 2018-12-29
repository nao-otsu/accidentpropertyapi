package com.example.accidentpropertyapi.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String userId;
    private int age;
    private String addUser;
    private LocalDateTime addDate;
    private String updateUser;
    private LocalDateTime updateDate;
    private Boolean deleteFlag;
}
