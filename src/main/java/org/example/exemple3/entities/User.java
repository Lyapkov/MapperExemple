package org.example.exemple3.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer a;
    private String b;
    private String c;
    private String d;
    private String e;
}
