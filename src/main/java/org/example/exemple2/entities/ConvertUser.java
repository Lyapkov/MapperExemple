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
public class ConvertUser {
    private int id;
    private String firstName;
    private String lastName;
    private String age;
    private List<ConvertHand> hands;

    private Integer extraConvert;
}
