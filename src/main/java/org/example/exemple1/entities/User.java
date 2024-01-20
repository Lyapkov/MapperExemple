package org.example.exemple1.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String age;
}
