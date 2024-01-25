package org.example.exemple2;

import org.example.exemple2.entities.Hand;
import org.example.exemple2.entities.User;
import org.example.exemple2.mapper.UserMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("имя")
                .lastName("Фамилия")
                .age(20)
                .extra("extra")
                .hands(List.of(
                        Hand
                                .builder()
                                .location("right")
                                .build(),
                        Hand
                                .builder()
                                .location("left")
                                .build()))
                .build();

        System.out.println(user);
        System.out.println(new UserMapper().convertToConvertUser(user));
    }
}
