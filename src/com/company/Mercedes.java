package com.company;

public class Mercedes extends Car {
    private  String yearOfIssue;

    public Mercedes(String model, String yearOfIssue) {
        super(model);
        this.yearOfIssue=yearOfIssue ;
    }

    @Override
    public void print() {
        System.out.println(" Mercedes " + " yearOfIssue " + yearOfIssue);
    }
}
