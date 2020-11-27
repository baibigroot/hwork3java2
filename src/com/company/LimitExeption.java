package com.company;

public class LimitExeption extends Exception {

    private double remainingAmout;

    public double getRemainingAmout() {
        return remainingAmout;
    }

    public LimitExeption(String message, double remainingAmout) {
        super(message);
        this.remainingAmout = remainingAmout;


    }
}