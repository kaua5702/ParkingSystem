package com.kauabiscotto.ParkingSystem;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create parking spaces
        ParkingSpace carSpace = new ParkingSpace(1, TipoVaga.CARRO);
        ParkingSpace motoSpace = new ParkingSpace(2, TipoVaga.MOTO);
        ParkingSpace truckSpace = new ParkingSpace(3, TipoVaga.CAMINHAO);

        // Create vehicles
        Vehicle car = new Car("ABC1234", "Fiesta", 2015);
        Vehicle motorcycle = new Motorcycle("XYZ5678", "Honda CG", 2020);
        Vehicle truck = new Truck("JKL9999", "Volvo FH", 2018);

        // Occupy spaces
        carSpace.occupy(car);
        motoSpace.occupy(motorcycle);
        truckSpace.occupy(truck);

        // Create tickets
        Ticket carTicket = new Ticket(car, carSpace);
        Ticket motoTicket = new Ticket(motorcycle, motoSpace);
        Ticket truckTicket = new Ticket(truck, truckSpace);

        // Simulate parking time
        Thread.sleep(2000);

        // Close tickets (exit recorded, but space still occupied)
        carTicket.closeTicket();
        motoTicket.closeTicket();
        truckTicket.closeTicket();

        // Print tickets
        System.out.println(carTicket);
        System.out.println(motoTicket);
        System.out.println(truckTicket);

        // Now release spaces manually
        carSpace.release();
        motoSpace.release();
        truckSpace.release();

        // Print spaces after release
        System.out.println(carSpace);
        System.out.println(motoSpace);
        System.out.println(truckSpace);
    }
}