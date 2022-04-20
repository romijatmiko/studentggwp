package com.romijatmiko.Studentproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "First name is required")
    @Column(nullable = false, name = "firstName")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Column(nullable = false, name = "lastName")
    private String lastName;

    @NotEmpty(message = "email is required")
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "Phone is required")
    @Column(nullable = false, name="phone", unique = true)
    private String phone;

    @NotEmpty(message = "Jurusan is required")
    @Column(nullable = false, name="jurusan")
    private String jurusan;
}

