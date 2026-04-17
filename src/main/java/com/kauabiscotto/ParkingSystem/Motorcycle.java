package com.kauabiscotto.ParkingSystem;

public class Motorcycle extends Vehicle {


    public Motorcycle(String plate, String model, int year) {
        super(plate, model, year);
    }


    @Override
    public double calculateFare(long hours) {
        double ratePerHour = 3.0;
        return ratePerHour * hours;
    }


    @Override
    public String toString() {
        return "Motorcycle {" +
                "plate='" + getPlate() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
