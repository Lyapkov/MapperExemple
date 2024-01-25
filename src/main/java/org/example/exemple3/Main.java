package org.example.exemple3;

import org.example.exemple3.entities.AudioBook;
import org.example.exemple3.entities.Book;
import org.example.exemple3.entities.ConvertAudioBook;
import org.example.exemple3.mapper.MapperWithConverter;


public class Main {
    public static void main(String[] args) {
        Book book = new AudioBook(1L, "11", "str", "book", 123, "comment");
        System.out.println(book);
        System.out.println(new MapperWithConverter().convertToConvertEntity(book));
        System.out.println((ConvertAudioBook) new MapperWithConverter().convertToConvertEntity(new AudioBook(1L, "11", "str", "book", 123, "comment")));
    }
}
