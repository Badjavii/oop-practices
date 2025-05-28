package com.github.badjavii;

public class TemperaturaNoValidaException extends RuntimeException {
    public TemperaturaNoValidaException() {
        super("La temperatura no puede ser inferior a -273 grados celsius.");
    }

    public TemperaturaNoValidaException(double celsius) {
        super("La temperatura no puede ser inferior a -273 grados celsius. La temperatura actual es " + celsius);
    }
}
