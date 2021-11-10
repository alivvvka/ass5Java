package com.company;

public class PageAssembly {

    private boolean cover = false;

    public void createCover(){

        System.out.println("Book cover was created!");
        this.cover = true;
    }

    public void stitching(){

        if (cover = true){

            System.out.println("Pages connected (with cover)!");
        }
        else{

            System.out.println("Pages connected (without cover)!");
        }
    }
}
