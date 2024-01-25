package org.example.exemple2.mapper;

import org.example.exemple2.entities.ConvertUser;
import org.example.exemple2.entities.User;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import static org.example.exemple2.functions.Function.randomFunction;

public class UserMapper {

    private final ModelMapper mapper;
    private Converter<Integer, String> ageConverter = (src) -> randomFunction(src.getSource());

    public UserMapper() {
        mapper = new ModelMapper();
        mapper.createTypeMap(User.class, ConvertUser.class)
                .addMappings(src -> src.map(User::getName, ConvertUser::setFirstName))
                .addMappings(src -> src.using(ageConverter).map(User::getAge, ConvertUser::setAge));
    }

    public ConvertUser convertToConvertUser(User user) {
        return mapper.map(user, ConvertUser.class);
    }
}
