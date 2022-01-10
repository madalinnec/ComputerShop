package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gpu {
    private String name;
    private int memory;
    private String resolution;
    private double price;

    public Gpu(String name, int memory, String resolution, double price) {
        this.name = name;
        this.memory = memory;
        this.resolution = resolution;
        this.price = price;
    }

    public Gpu() {
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    public String getResolution() {
        return resolution;
    }

    public double getPrice() {
        return price;
    }

    public Gpu gpuOptions(){
        List<Gpu> gpus = new ArrayList<>();
        gpus.add(new Gpu("Nvidia RTX 2060",6,"up to 1440p", 3499.90));
        gpus.add(new Gpu("Nvidia GTX 1660TI",6,"1080p",2699.90));
        gpus.add(new Gpu("Nvidia GTX 1060",6,"1080p",2499.90));
        Gpu gpuChosen = new Gpu();
        System.out.println("Please choose one of the options below: ");
        for (int i = 0; i < gpus.size(); i++) {
            System.out.println((i+1) + " - " + gpus.get(i).getName()
                    + ", " + gpus.get(i).getResolution()
                    + ", " + gpus.get(i).getMemory() + " GB"
                    + ", " + gpus.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                gpuChosen = gpus.get(0);
                break;
            case 2:
                gpuChosen = gpus.get(1);
                break;
            case 3:
                gpuChosen = gpus.get(2);
                break;
            default:
                System.out.println("No valid option was chosen.");
        }
        return gpuChosen;
    }
}