package Entities;

public class HotAirBalloon extends AirTransport {

    private int numberOfPassengers;
    private String type;

    public HotAirBalloon(String name, String maker, byte numberOfEngines, byte numberOfTires, int numberOfPassengers, String type) {
        super(name, maker, numberOfEngines, numberOfTires);
        this.numberOfPassengers = numberOfPassengers;
        this.type = type;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HotAirBalloon { " +
                "numberOfPassengers = " + numberOfPassengers +
                ", type = " + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public String showTransportName() {
        return "Will land a " + getName();
    }

    @Override
    public String takeOffVertically() {
        return "The hot air balloon has take off vertically correctly.";
    }

    @Override
    public String landVertically() {
        return "The hot air balloon has land vertically correctly.";
    }

    @Override
    public String takeOffHorizontally() {
        return "The hot air balloon can´t take off horizontally.";
    }

    @Override
    public String landHorizontally() {
        return "The hot air balloon can´t land horizontally.";
    }
}