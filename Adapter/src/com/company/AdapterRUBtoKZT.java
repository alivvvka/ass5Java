package com.company;

public class AdapterRUBtoKZT implements USDconverter{
    RUBBank rubBank;

    AdapterRUBtoKZT(RUBBank rubBank){

        this.rubBank = rubBank;
    }

    @Override
    public double toKZT(double rub) {

        return rubBank.toUSD(rub) * 427.02;
    }

    @Override
    public void getKZT(double rub) {

        System.out.println(rub + "₽ = " + toKZT(rub) + "₸");
    }
}
