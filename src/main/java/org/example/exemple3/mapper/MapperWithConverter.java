package org.example.exemple3.mapper;

import org.example.exemple3.entities.ConvertUser;
import org.example.exemple3.entities.User;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

public class MapperWithConverter {

    private final ModelMapper mapper;

    private Converter<String, String> converter = (src) -> src.getSource().replace("-", "_");

    public MapperWithConverter() {
        mapper = new ModelMapper();
        mapper.addConverter(converter);
    }

    public ConvertUser convertToConvertEntity(User entity) {
        return mapper.map(entity, ConvertUser.class);
    }

}
