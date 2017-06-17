package com.moonzhou.TypeSimple;

public class ForcedConversion {

    public static void main(String[] args) {
        dobuleToInt();
    }

    private static void dobuleToInt() {
        int initNum = 15;
        
        double sqrtVal = Math.sqrt(initNum);
        double floorVal = Math.floor(sqrtVal);
        
        int contVal = (int) sqrtVal;
        int floorConvertVal = (int) floorVal;

        System.out.println("sqrtVal: " + sqrtVal);
        System.out.println("contVal: " + contVal);
        System.out.println();
        System.out.println("floorVal: " + floorVal);
        System.out.println("floorConvertVal: " + floorConvertVal);
    }

}
