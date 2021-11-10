package com.company;

public class Orc implements Race{

    private Classification cls;


    public Orc(Classification cls) {
        this.cls = cls;
    }

    @Override
    public void getRaceName() {
        System.out.println("My race is Orc!");
    }

    @Override
    public void getScream() {
        System.out.println("For the Horde!!!");
    }

    public void skillBloodFury(){
        System.out.println("Race Skill Blood Fury is used!");
    }
}
