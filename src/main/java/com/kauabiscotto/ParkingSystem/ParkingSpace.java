package com.kauabiscotto.ParkingSystem;

public class ParkingSpace {

    private int number;
    private TipoVaga allowedType;
    private boolean taken;
    private Vehicle vehicle;


    public ParkingSpace(int number, TipoVaga allowedType) {
        this.number = number;
        this.allowedType = allowedType;
        this.taken = true;
        this.vehicle = null;
    }

    public boolean isTaken() {
        return taken;
    }

    public void occupy(Vehicle vehicle) {
        if (!taken) {
            if ((vehicle instanceof Car && allowedType == TipoVaga.CARRO) ||
                    (vehicle instanceof Motorcycle && allowedType == TipoVaga.MOTO) ||
                    (vehicle instanceof Truck && allowedType == TipoVaga.CAMINHAO)) {

                this.vehicle = vehicle;
                this.taken = true;
            } else {
                System.out.println("Vehicle type not allowed in this spot.");
            }
        } else {
            System.out.println("The spot is already taken.");
        }
    }

    public void release() {
        this.vehicle = null;
        this.taken = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "number=" + number +
                ", allowedType=" + allowedType +
                ", taken=" + taken +
                ", vehicle=" + (vehicle != null ? vehicle.getPlate() : "none") +
                '}';
    }
}

