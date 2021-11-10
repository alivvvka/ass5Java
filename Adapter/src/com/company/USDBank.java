package com.company;

public class USDBank implements USDconverter{

    @Override
    public double toKZT(double usd) {

        return usd * 427.02;
    }

    @Override
    public void getKZT(double usd) {

        System.out.println(usd + "$ = " + toKZT(usd) + "₸");
    }
}
