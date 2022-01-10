package computerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motherboard {
    private String name;
    private double price;
    private Gpu gpu;
    private Cpu cpu;
    private Ram ram;
    private Ssd ssd;

    public Motherboard(String name, double price, Gpu gpu, Cpu cpu, Ram ram, Ssd ssd) {
        this.name = name;
        this.price = price;
    }

    public Motherboard(Gpu gpu, Cpu cpu, Ram ram, Ssd ssd){
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Gpu chooseGpu() {
        Gpu gpu = new Gpu();
        gpu = gpu.gpuOptions();
        return gpu;
    }

    public String toString(){
        return "Motherboard : " + name + ", "
                                + price + ", "
                                + gpu + ", "
                                + cpu + ", "
                                + ram + ", "
                                + ssd;

    }

    public Motherboard motherboardOptions(Gpu gpu, Cpu cpu, Ram ram, Ssd ssd) {
        List<Motherboard> motherboards = new ArrayList<>();
        motherboards.add(new Motherboard("Asus", 899.90, gpu, cpu, ram, ssd));
        motherboards.add(new Motherboard("ASRock", 799.99, gpu, cpu, ram, ssd));
        motherboards.add(new Motherboard("MSI", 549.99, gpu, cpu, ram, ssd));
        Motherboard motherboardChosen = new Motherboard(gpu, cpu, ram, ssd);
        System.out.println("Please choose one of the Motherboards below: ");
        for (int i = 0; i < motherboards.size(); i++) {
            System.out.println((i + 1) + " - " + motherboards.get(i).getName()
                                        + ", " + motherboards.get(i).getPrice() + " RON");
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                motherboardChosen = motherboards.get(0);
                break;
            case 2:
                motherboardChosen = motherboards.get(1);
                break;
            case 3:
                motherboardChosen = motherboards.get(2);
                break;
            default:
                System.out.println("No valid option was chosen.");
        }
        return motherboardChosen;
    }
}
