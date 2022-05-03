package com.company;

public class Kia extends Car {
    private  String colour;

    public Kia(String model, String colour) {
        super(model);
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println( " Kia " + " Colour " + colour);
    }
}
