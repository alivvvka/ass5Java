package com.company;

public class RUBBank {

    public double toUSD(double rub){

        return rub/70.6;
    }

    public void getUSD(double rub){

        System.out.println(rub + "₽ = " + toUSD(rub) + "₸");
    }
}
