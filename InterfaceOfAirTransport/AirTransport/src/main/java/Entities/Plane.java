package Entities;

public class Plane extends AirTransport {

    private byte numberOfSeats;

    public Plane(String name, String maker, byte numberOfEngines, byte numberOfTires, byte numberOfSeats) {
        super(name, maker, numberOfEngines, numberOfTires);
        this.numberOfSeats = numberOfSeats;
    }

    public byte getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Plane { " +
                "numberOfSeats = " + numberOfSeats +
                "} " + super.toString();
    }

    @Override
    public String showTransportName() {
        return "Will land a " + getName();
    }

    @Override
    public String takeOffVertically() {
        return "The plane can´t take off vertically.";
    }

    @Override
    public String landVertically() {
        return "The plane can´t land vertically.";
    }

    @Override
    public String takeOffHorizontally() {
        return "The plane has take off horizontally correctly.";
    }

    @Override
    public String landHorizontally() {
        return "The plane has land horizontally correctly.";
    }
}