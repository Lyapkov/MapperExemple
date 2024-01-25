package org.example.exemple3.mapper;

import org.example.exemple3.entities.AudioBook;
import org.example.exemple3.entities.Book;
import org.example.exemple3.entities.ConvertAudioBook;
import org.example.exemple3.entities.ConvertBook;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class MapperWithConverter {

    private final ModelMapper mapper;


    public MapperWithConverter() {
        mapper = new ModelMapper();

//        TypeMap<Book, ConvertBook> baseTypeMap = mapper.createTypeMap(Book.class, ConvertBook.class);
//        baseTypeMap.include(AudioBook.class, ConvertBook.class);
    }

    public ConvertBook convertToConvertEntity(Book entity) {
        TypeMap<Book, ConvertBook> baseTypeMap = mapper.createTypeMap(Book.class, ConvertBook.class);
        baseTypeMap.include(AudioBook.class, ConvertAudioBook.class);
        return mapper.map(entity, ConvertBook.class);
    }

}
