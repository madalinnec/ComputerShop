package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ssd {
    private String name;
    private int capacity;
    private double price;

    public Ssd(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public Ssd() {
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public Ssd ssdOptions(){
        List<Ssd> ssds = new ArrayList<>();
        ssds.add(new Ssd("ADATA",128,99.99));
        ssds.add(new Ssd("Kingston",256,189.99));
        ssds.add(new Ssd("Intel",512,349.99));
        Ssd ssdChosen = new Ssd();
        System.out.println("Please choose one of the options below: ");
        for (int i = 0; i < ssds.size(); i++) {
            System.out.println((i+1) + " - " + ssds.get(i).getName()
                    + ", " + ssds.get(i).getCapacity() + " GB"
                    + ", " + ssds.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                ssdChosen = ssds.get(0);
                break;
            case 2:
                ssdChosen = ssds.get(1);
                break;
            case 3:
                ssdChosen = ssds.get(2);
                break;
            default:
                System.out.println("No valid option was chosen.");
        }
        return ssdChosen;
    }
}
