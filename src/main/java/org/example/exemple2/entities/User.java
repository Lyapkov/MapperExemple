package org.example.exemple2.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Hand> hands;
}
