package Entities;

import Interfaces.ActionsMeansOfTransport;

public abstract class AirTransport implements ActionsMeansOfTransport {

    private String name;
    private String maker;
    private byte numberOfEngines;
    private byte numberOfTires;

    public AirTransport(String name, String maker, byte numberOfEngines, byte numberOfTires) {
        this.name = name;
        this.maker = maker;
        this.numberOfEngines = numberOfEngines;
        this.numberOfTires = numberOfTires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public byte getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(byte numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public byte getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(byte numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    /**
     * Este método deberá ser implementado en la clase que lo requiera para mostrar al
     * usuario el nombre del transporte
     * @return String
     */
    public abstract String showTransportName();

    @Override
    public String toString() {
        return "AirTransport { " +
                "name = " + name + '\'' +
                ", maker = " + maker + '\'' +
                ", numberOfEngines = " + numberOfEngines +
                ", numberOfTires = " + numberOfTires +
                '}';
    }
}