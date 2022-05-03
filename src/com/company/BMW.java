package com.company;

public class BMW extends Car {
    private  String volume;

    public BMW(String model, String volume) {
        super(model);
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println(" BMW " + " Volume " + volume);
    }
}
