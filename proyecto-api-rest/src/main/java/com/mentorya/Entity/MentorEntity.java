package com.mentorya.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MentorEntity {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String profesion;
    private String rubro;
}
