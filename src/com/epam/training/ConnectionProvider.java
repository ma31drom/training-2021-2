package com.epam.training;

import java.net.URI;

public class ConnectionProvider {

    public void createConnection() {
        System.out.println("Connecting to localHost");
    }

    public void createConnection(URI uri) {
        System.out.println("Connecting to " + uri.toString());
    }

    public void createConnection(String connectionString) {
        System.out.println("Connecting to " + connectionString);
    }

}
