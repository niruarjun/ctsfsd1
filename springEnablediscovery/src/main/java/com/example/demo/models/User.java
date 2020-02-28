package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer userId;
private String username;
private String publicEmail;

}
