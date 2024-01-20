package org.example.exemple2.mapper;

import org.example.exemple2.entities.ConvertHand;
import org.example.exemple2.entities.ConvertUser;
import org.example.exemple2.entities.Hand;
import org.example.exemple2.entities.User;
import org.modelmapper.ModelMapper;

public class UserMapper {

    private final ModelMapper mapper;

    public UserMapper() {
        mapper = new ModelMapper();
    }

    public ConvertUser convertToConvertUser(User user) {
//        mapper.createTypeMap(Hand.class, ConvertHand.class);
        return mapper.map(user, ConvertUser.class);
    }
}
