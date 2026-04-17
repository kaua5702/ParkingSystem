package com.kauabiscotto.ParkingSystem;

public class Car extends Vehicle{

    public Car(String plate, String model, int year) {
        super(plate, model, year);
    }


    @Override
    public double calculateFare(long hours) {
        double ratePerHour = 5.0;
        return ratePerHour * hours;
    }


    @Override
    public String toString() {
        return "Car {" +
                "plate='" + getPlate() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                '}';
    }


}
