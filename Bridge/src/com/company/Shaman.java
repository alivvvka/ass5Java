package com.company;

public class Shaman implements Classification{

    private String role;


    public Shaman(String role) {

        if (role == "Healer" || role == "DD" || role == "RDD"){
            this.role = role;
        }
        else{
            System.out.println("Wrong role!!!");
            this.role = "Healer";
        }
    }

    @Override
    public void getClassificationName() {
        System.out.println("I'm Shaman!");
    }

    @Override
    public void getRole() {
        System.out.println("My role is " + this.role);
    }

    public void skillLightningBolt(){
        System.out.println("Skill Lightning Bolt is used!");
    }

    public void skillHeal(){
        System.out.println("Skill Heal is used!");
    }
}
