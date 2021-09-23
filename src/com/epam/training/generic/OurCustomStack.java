package com.epam.training.generic;

import java.util.Arrays;

public class OurCustomStack<TYPE> {

    private TYPE[] data;
    private int position;

    public OurCustomStack(TYPE[] data) {
        this.data = Arrays.copyOf(data, data.length);
        position = 0;
    }

    public void add(TYPE element) {
        checkLenthIsSufficient();
        data[position] = element;
        position++;
    }

    public void addMany(TYPE... element) {
        for (TYPE el : element) {
            add(el);
        }
    }


    public TYPE get() {
        if (position >= 1) {
            TYPE datum = data[position - 1];
            position--;
            return datum;
        } else {
            return null;
        }
    }

    public <TYPE2 extends TYPE> TYPE2 tryToGet(Class<TYPE2> clazz) {
        TYPE type = get();
        if (clazz.isAssignableFrom(type.getClass())) {
            return (TYPE2) type;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void checkLenthIsSufficient() {
        if (data.length < position + 2) {
            int resultingLenth = data.length;
            if (data.length == 0) {
                resultingLenth = 2;
            }
            data = Arrays.copyOf(data, resultingLenth * 2);
        }
    }

}
