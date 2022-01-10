package computerBuilder;

public class ComputerCase {
    private String name;
    private double price;
    private Motherboard motherboard;
    private PowerSupply powerSupply;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
}
