package com.example.accidentpropertyapi.Model;

import lombok.Data;

@Data
public class User {
    private String userId;
    private int age;
    private String addUser;
    private String addDate;
    private String updateUser;
    private String updateDate;
    private Boolean deleteFlag;
}
