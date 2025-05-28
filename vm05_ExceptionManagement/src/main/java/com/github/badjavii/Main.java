package com.github.badjavii;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        try {
            System.out.println(conversor.celsiusAFharenheit(-500));
        } catch (TemperaturaNoValidaException myException) {
            myException.printStackTrace();
        }


    }
}