package com.company;

public class Draenei implements Race{

    private Classification cls;


    public Draenei(Classification cls) {
        this.cls = cls;
    }

    @Override
    public void getRaceName() {
        System.out.println("My race is Draenei!");
    }

    @Override
    public void getScream() {
        System.out.println("For the Alliance!!!");
    }

    public void skillGiftOfNaaru(){
        System.out.println("Race Skill Gift of the Naaru is used!");
    }
}
