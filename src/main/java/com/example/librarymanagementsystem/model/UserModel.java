package com.example.librarymanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String surname;
    private LocalDate birthDay;
}
