package org.example.exemple3.entities;


public class AudioBook extends Book {
    private Integer playLength;
    private String reader;

    public AudioBook(Long id, String bookName, String index, String comment, Integer playLength, String reader) {
        super(id, bookName, index, comment);
        this.playLength = playLength;
        this.reader = reader;
    }
}
