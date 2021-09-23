package com.epam.training;

import com.epam.training.internal.SecondClass;

public class RecursionSecondClass extends RecursionFirstClass {


    public RecursionSecondClass(int a) {
        super(2);
        System.out.println(a);
    }

    public void recurse() {
        new RecursionFirstClass(1).recurse();
    }
}
