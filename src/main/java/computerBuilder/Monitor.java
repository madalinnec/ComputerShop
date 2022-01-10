package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monitor {
    private String name;
    private String resolution;
    private double price;

    public Monitor(String name, String resolution, double price) {
        this.name = name;
        this.resolution = resolution;
        this.price = price;
    }

    public Monitor() {
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public double getPrice() {
        return price;
    }

    public Monitor monitorOptions(){
        List<Monitor> monitors = new ArrayList<>();
        monitors.add(new Monitor("Samsung","4k",999.99));
        monitors.add(new Monitor("LG","Full HD",549.90));
        monitors.add(new Monitor("Horizon","HD",349.90));
        Monitor monitorChosen = new Monitor();
        System.out.println("Please choose one of the options below: ");
        for (int i = 0; i < monitors.size(); i++) {
            System.out.println((i+1) + " - " + monitors.get(i).getName()
                                     + ", " + monitors.get(i).getResolution()
                                     + ", " + monitors.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                monitorChosen = monitors.get(0);
                break;
            case 2:
                monitorChosen = monitors.get(1);
                break;
            case 3:
                monitorChosen = monitors.get(2);
                break;
            default:
                System.out.println("No valid option was chosen.");
        }
        return monitorChosen;
    }
}
