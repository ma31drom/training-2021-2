package com.epam.training.internal;

import com.epam.training.FirstClass;

public class SecondClass {

    private static SecondClass instance;

    private SecondClass() {
    }

    public static synchronized SecondClass getInstance() {
        if (instance == null) {
            instance = new SecondClass();
        }
        return instance;
    }

    public void sample() {
        System.out.println("Second class method called");

    }

}
