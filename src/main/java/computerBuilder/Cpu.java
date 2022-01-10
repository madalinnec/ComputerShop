package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cpu {
    private String name;
    private double price;
    private int cacheMemory;
    private double frequency;
    private int cores;

    public Cpu(String name, double price, int cacheMemory, double frequency, int cores) {
        this.name = name;
        this.price = price;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.cores = cores;
    }

    public Cpu() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String toString(){
        return "CPU: " + name + ", "
                        + cacheMemory + ", "
                        + frequency + ", "
                        + cores + ", "
                        + price;
    }

    public Cpu cpuOptions(){
        List<Cpu> cpus = new ArrayList<>();
        cpus.add(new Cpu("Intel i7", 1599.90,16,4.8,8));
        cpus.add(new Cpu("Intel i5", 1099.90,8,3.6,6));
        cpus.add(new Cpu("AMD Ryzen 5", 1399.90,32,4.5,10 ));
        Cpu cpuChosen = new Cpu();
        System.out.println("Please choose one of the CPUs below: ");
        for (int i = 0; i < cpus.size(); i++) {
            System.out.println((i+1) + " - " + cpus.get(i).getName()
                    + ", " + cpus.get(i).getCacheMemory() + " MB"
                    + ", " + cpus.get(i).getFrequency() + " Ghz"
                    + ", " + cpus.get(i).getCores() + " Cores"
                    + ", " + cpus.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        boolean tryAgain = false;
        while(!tryAgain) {
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    cpuChosen = cpus.get(0);
                    tryAgain = true;
                    break;
                case 2:
                    cpuChosen = cpus.get(1);
                    tryAgain = true;
                    break;
                case 3:
                    cpuChosen = cpus.get(2);
                    tryAgain = true;
                    break;
                default:
                    System.out.println("No valid option was chosen. Please choose again");
            }
        }
        return cpuChosen;
    }
}
