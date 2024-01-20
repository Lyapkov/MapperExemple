package org.example.exemple1.mapper;

import org.example.exemple1.entities.ConvertUser;
import org.example.exemple1.entities.User;
import org.modelmapper.ModelMapper;

public class UserMapper {

    private final ModelMapper mapper;

    public UserMapper() {
        mapper = new ModelMapper();
    }

    public ConvertUser convertToConvertUser(User user) {
        return mapper.map(user, ConvertUser.class);
    }
}
