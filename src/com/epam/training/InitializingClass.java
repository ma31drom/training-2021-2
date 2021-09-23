package com.epam.training;

import java.sql.SQLOutput;

public class InitializingClass {

    private int b;
    private static int a;

    public InitializingClass() {
        System.out.println("I'm Constructor");
    }

    static {
        a = 10;
        System.out.println("I'm static block of initialization");
    }

    {
        System.out.println("I'm dynamic block of initialization");
        b = 10;
        a = 5;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        InitializingClass.a = a;
    }


}
