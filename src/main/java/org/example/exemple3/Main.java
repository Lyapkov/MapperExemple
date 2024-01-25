package org.example.exemple3;

import org.example.exemple3.entities.User;
import org.example.exemple3.mapper.MapperWithConverter;

public class Main {
    public static void main(String[] args) {
        User entity = User.builder()
                .a(1)
                .b("-")
                .c("ос-тs-ds")
                .d("уби_ра-ем оставляем")
                .e("вававы-")
                .build();

        System.out.println(entity);
        System.out.println(new MapperWithConverter().convertToConvertEntity(entity));
    }
}
