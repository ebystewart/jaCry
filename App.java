package com.globalSoftwareSupport;

public class App{

    public static void main(String[] args){
        ECC ecc = new ECC(0, 7);
        Point generator = new Point(1,1);
        System.out.Println(ecc.pointAddition(generator, generator));
    }
}