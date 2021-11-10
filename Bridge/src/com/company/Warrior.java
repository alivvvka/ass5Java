package com.company;

public class Warrior implements Classification{

    private String role;


    public Warrior(String role) {

        if (role == "Tank" || role == "DD"){
            this.role = role;
        }
        else{
            System.out.println("Wrong role!!!");
            this.role = "Tank";
        }
    }

    @Override
    public void getClassificationName() {
        System.out.println("I'm Warrior!");
    }

    @Override
    public void getRole() {
        System.out.println("My role is " + this.role);
    }

    public void skillHeroHit(){
        System.out.println("Skill Hero Hit is used!");
    }

    public void skillCharge(){
        System.out.println("Skill Charge is used!");
    }
}
