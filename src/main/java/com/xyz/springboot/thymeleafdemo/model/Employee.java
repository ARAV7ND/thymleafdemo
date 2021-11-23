package com.xyz.springboot.thymeleafdemo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
