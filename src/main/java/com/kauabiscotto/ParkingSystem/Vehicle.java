package com.kauabiscotto.ParkingSystem;

public abstract class Vehicle {

    private String plate;
    private String model;
    private int year;


    public Vehicle (String plate, String model, int year) {
        this.plate = plate;
        this.model = model;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public abstract double calculateFare(long hours);
}
