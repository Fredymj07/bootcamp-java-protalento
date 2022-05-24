package Entities;

public class Helicopter extends AirTransport {

    private String model;
    private String useType;

    public Helicopter(String name, String maker, byte numberOfEngines, byte numberOfTires, String model, String useType) {
        super(name, maker, numberOfEngines, numberOfTires);
        this.model = model;
        this.useType = useType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    @Override
    public String toString() {
        return "Helicopter { " +
                "model = " + model + '\'' +
                ", useType = " + useType + '\'' +
                "} " + super.toString();
    }

    @Override
    public String showTransportName() {
        return "Will land a " + getName();
    }

    @Override
    public String takeOffVertically() {
        return "The helicopter has take off vertically correctly.";
    }

    @Override
    public String landVertically() {
        return "The helicopter has land vertically correctly.";
    }

    @Override
    public String takeOffHorizontally() {
        return "The helicopter has take off horizontally correctly.";
    }

    @Override
    public String landHorizontally() {
        return "The helicopter has land horizontally correctly.";
    }
}