package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ram {
    private String name;
    private int memorySize;
    private double price;

    public Ram(String name, int memorySize, double price) {
        this.name = name;
        this.memorySize = memorySize;
        this.price = price;
    }

    public Ram(){

    }

    public String getName() {
        return name;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getPrice() {
        return price;
    }

    public Ram ramOptions(){
        List<Ram> rams = new ArrayList<>();
        rams.add(new Ram("ADATA",1024,56.99));
        rams.add(new Ram("Kingston",2048,89.90));
        rams.add(new Ram("Crucial",4096,190.90));
        Ram ramChosen = new Ram();
        System.out.println("Please choose one of the options below: ");
        for (int i = 0; i < rams.size(); i++) {
            System.out.println((i+1) + " - " + rams.get(i).getName()
                    + ", " + rams.get(i).getMemorySize() + " MB"
                    + ", " + rams.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                ramChosen = rams.get(0);
                break;
            case 2:
                ramChosen = rams.get(1);
                break;
            case 3:
                ramChosen = rams.get(2);
                break;
            default:
                System.out.println("No valid option was chosen.");
        }
        return ramChosen;
    }

}
