package com.github.badjavii;

public class Conversor {
    public double celsiusAFharenheit(float celsius) throws TemperaturaNoValidaException {
        if (celsius < -273)
            throw new TemperaturaNoValidaException(celsius);

        return 9.0/5.0*celsius + 32;
    }
}