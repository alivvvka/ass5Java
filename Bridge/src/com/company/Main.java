package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior war = new Warrior("Tank");
        Orc orc = new Orc(war);

        orc.getRaceName();
        orc.getScream();
        orc.skillBloodFury();

        war.getClassificationName();
        war.getRole();
        war.skillCharge();
        war.skillHeroHit();
        System.out.println("----------------------------");

        Shaman sham = new Shaman("RDD");
        Draenei dra = new Draenei(sham);

        dra.getRaceName();
        dra.getScream();
        dra.skillGiftOfNaaru();

        sham.getClassificationName();
        sham.getRole();
        sham.skillHeal();
        sham.skillLightningBolt();
    }
}
