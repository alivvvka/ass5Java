package com.company;

public class Main {

    public static void main(String[] args) {
        USDconverter usdBank = new USDBank();

        usdBank.getKZT(12.3);


        RUBBank rubBank = new RUBBank();
        AdapterRUBtoKZT adapter = new AdapterRUBtoKZT(rubBank);

        adapter.getKZT(701.6);
    }
}
