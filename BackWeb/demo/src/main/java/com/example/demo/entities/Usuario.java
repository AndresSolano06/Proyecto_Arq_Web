package com.example.demo.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class Usuario {
    private String firstname;
    private String lastname;
    private String Phone;
    private String mail;
    private String document;

}
