package com.kauabiscotto.ParkingSystem;

public class Truck extends Vehicle {

    public Truck(String plate, String model, int year) {
        super(plate, model, year);
    }


    @Override
    public double calculateFare(long hours) {
        double ratePerHour = 10.0;
        return ratePerHour * hours;
    }

    @Override
    public String toString() {
        return "Truck {" +
                "plate='" + getPlate() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
