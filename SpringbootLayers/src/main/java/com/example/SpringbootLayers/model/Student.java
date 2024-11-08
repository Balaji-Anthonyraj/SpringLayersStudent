package com.example.SpringbootLayers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student
{
    @Id
    private int rno;
    private String name;
    private String technology;
}
