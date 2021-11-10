package com.company;

public class Main {

    public static void main(String[] args) {
        BookCreationFacade bkf = new BookCreationFacade();

        bkf.createBook(15);
        //in real this function should return file or something like that
    }
}
