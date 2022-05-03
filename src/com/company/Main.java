package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {createObject(1), createObject(2), createObject(3)};
        for (int i = 0; i < cars.length; i++) {
            if (i < cars.length && cars[i] instanceof Printable) {
                cars[i].print();
            }
        }
    }

    public static Car createObject(int Car) {
        BMW bmw = new BMW("BMW", "3.5");
        Mercedes mercedes = new Mercedes("Mercedes", "1998");
        Kia kia = new Kia("Kia", "Black");
        switch (Car) {
            case 1:
                return bmw;
            case 2:
                return mercedes;
            case 3:
                return kia;
        }
        Car[] cars = {bmw, mercedes, kia};
        return null;

    }
}
