package com.epam.training;

import com.epam.training.internal.SecondClass;

public class FirstClass {

    private int fieldA;

    public static int clazzField = 0;

    public FirstClass() {
    }

    public FirstClass(int fieldA) {
        this.fieldA = fieldA;
    }

    public void callMe() {

        int a = 1;

        fieldA = a;

        callMeAgain();
    }




    public void testMethod() {
        SecondClass d;
        d = SecondClass.getInstance();
        d.sample();
    }

    void callMeFreindly() {
        fieldA++;
    }

    protected void callMeProtected() {
        fieldA++;
    }
    
    private void callMeAgain() {
        fieldA++;
    }
}
