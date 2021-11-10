package com.company;

public class BookCreationFacade {

    public void createBook(int pageAmount){
        PaperCreator pc = new PaperCreator();
        Printer pr = new Printer(pc , pageAmount);
        PageAssembly pa = new PageAssembly();

        pc.woodCreation();
        pc.sawdustCreation();
        pc.createPaper();

        pr.inkCreation();
        pr.printPages();

        pa.createCover();
        pa.stitching();
        System.out.println("Book was created!");
    }
}
