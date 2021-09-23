package com.epam.training.enumeration;

import java.net.CookieHandler;

public enum ConnectionType {

    DB(" database connectivity"),
    SOCKET(" specific socket connectivity"),
    HTTP(" regular internet connectivity");

    private String toPrint;

    ConnectionType(String print) {
        this.toPrint = print;
    }

    public void printConnection() {
        System.out.println("Current connection " + name() + " and it prints: " + toPrint);
    }

}
