package com.example.springsecuritybasic.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
@Getter
@Setter
@Table(name = "customer")
@Entity(name = "bank")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long id;
    private String email;
    private String pwd;
    private String role;
}
