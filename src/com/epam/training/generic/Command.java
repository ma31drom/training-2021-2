package com.epam.training.generic;

public class Command {

    private String value;

    public Command(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
