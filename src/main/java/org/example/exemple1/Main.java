package org.example.exemple1;

import org.example.exemple1.entities.User;
import org.example.exemple1.mapper.UserMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new UserMapper().convertToConvertUser(
                        User
                                .builder()
                                .id(1)
                                .firstName("имя")
                                .lastName("Фамилия")
                                .age("20")
                                .build())
        );
    }
}
