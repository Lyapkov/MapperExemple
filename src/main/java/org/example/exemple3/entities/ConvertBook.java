package org.example.exemple3.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConvertBook {
//    private Integer playLength;
//    private String reader;
    private Long id;
    private String bookName;
    private String index;
    private String comment;
}
