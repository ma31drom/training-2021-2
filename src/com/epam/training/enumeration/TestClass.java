package com.epam.training.enumeration;

import com.epam.training.generic.Command;

public class TestClass {
    public static void main(String[] args) {
        ConnectionType db = ConnectionType.DB;
        int i = db.compareTo(ConnectionType.HTTP);
        if (i > 0) {
            System.out.println("HTTP < DB");
        } else {
            System.out.println("HTTP > DB");
        }

        db.printConnection();
    }
}
