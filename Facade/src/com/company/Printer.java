package com.company;

public class Printer {

    private PaperCreator pc = new PaperCreator();
    private int pageAmount = 0;
    private boolean ink = false;


    public Printer(PaperCreator pc, int pageAmount) {

        this.pc = pc;
        this.pageAmount = pageAmount;
    }

    public void inkCreation(){

        this.ink = true;
        System.out.println("We have ink!");
    }

    public void printPages(){

        if (ink == false || pc.checkPaper() == false){
            System.out.println("Can't print!(check ink and paper!)");
        }
        else{
            for (int i = 0; i < pageAmount; i++){
                System.out.println(i + " page was printed!");
            }
        }
    }
}
