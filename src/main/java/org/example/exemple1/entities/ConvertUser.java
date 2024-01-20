package org.example.exemple1.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConvertUser {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Integer integer;
}
