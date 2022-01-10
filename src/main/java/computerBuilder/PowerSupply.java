package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSupply {
    private String name;
    private double price;
    private String power;

    public PowerSupply(String name, double price, String power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public PowerSupply() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPower() {
        return power;
    }

    public String toString(){
        return "Power Supply: " + name + ", "
                                + price + ", "
                                + power;
    }

    public PowerSupply powerSupplyOptions() {
        List<PowerSupply> powerSupplies = new ArrayList<>();
        powerSupplies.add(new PowerSupply("Segotep", 500.49, "800 W"));
        powerSupplies.add(new PowerSupply("Crucial", 459.99, "600 W"));
        powerSupplies.add(new PowerSupply("Serioux", 259.99, "450 W"));
        PowerSupply powerSupplyChosen = new PowerSupply();
        System.out.println("Please choose one of the power supplies below: ");
        for (int i = 0; i < powerSupplies.size(); i++) {
            System.out.println((i + 1) + " - " + powerSupplies.get(i).getName()
                    + ", " + powerSupplies.get(i).getPower()
                    + ", " + powerSupplies.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        boolean tryAgain = false;
        while(!tryAgain) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    powerSupplyChosen = powerSupplies.get(0);
                    tryAgain = true;
                    break;
                case 2:
                    powerSupplyChosen = powerSupplies.get(1);
                    tryAgain = true;
                    break;
                case 3:
                    powerSupplyChosen = powerSupplies.get(2);
                    tryAgain = true;
                    break;
                default:
                    System.out.println("No valid option was chosen. Please choose again");
            }
        }
        return powerSupplyChosen;
    }
}
