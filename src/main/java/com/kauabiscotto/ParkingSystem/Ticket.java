package com.kauabiscotto.ParkingSystem;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ticket {

    private Vehicle vehicle;
    private ParkingSpace parkingSpace;
    private long entryTime;
    private long exitTime;

    public Ticket(Vehicle vehicle, ParkingSpace parkingSpace) {
        this.vehicle = vehicle;
        this.parkingSpace = parkingSpace;
        this.entryTime = System.currentTimeMillis(); // record entry
        this.exitTime = 0; // not closed yet
    }

    public void closeTicket() {
        this.exitTime = System.currentTimeMillis(); // record exit
    }

    public long getDurationHours() {
        if (exitTime == 0) {
            return 0; // still open
        }
        long durationMillis = exitTime - entryTime;
        return Math.max(1, durationMillis / (1000 * 60 * 60)); // at least 1 hour
    }

    public double calculateTotalFare() {
        long hours = getDurationHours();
        return vehicle.calculateFare(hours);
    }

    private String formatTime(long millis) {
        if (millis == 0) return "Still open";
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault());
        return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "\n=== Ticket ===" +
                "\nVehicle: " + vehicle +
                "\nParking Space: " + parkingSpace +
                "\nEntry: " + formatTime(entryTime) +
                "\nExit: " + formatTime(exitTime) +
                "\nDuration (h): " + getDurationHours() +
                "\nTotal Fare: $" + (exitTime != 0 ? calculateTotalFare() : "open") +
                "\n================\n";
    }
}