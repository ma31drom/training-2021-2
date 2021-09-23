package com.epam.training;

import com.epam.training.internal.SecondClass;

public class RecursionFirstClass {

    public RecursionFirstClass(int a) {
        System.out.println(a);
    }

    void recurse() {
        new RecursionSecondClass(1).recurse();
    }

}
