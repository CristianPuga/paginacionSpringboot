package com.hackathongestamp2020.Backend.Domain;

public class VentasNotFoundException extends RuntimeException {

    VentasNotFoundException(String id) {
        super("Could not find customer " + id);
    }
}
