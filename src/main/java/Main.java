import computerBuilder.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        cpu = cpu.cpuOptions();
        Gpu gpu = new Gpu();
        gpu = gpu.gpuOptions();
        Ram ram = new Ram();
        ram = ram.ramOptions();
        Ssd ssd = new Ssd();
        ssd = ssd.ssdOptions();
        Motherboard motherboard = new Motherboard(gpu, cpu, ram, ssd);
        motherboard = motherboard.motherboardOptions(gpu, cpu, ram, ssd);
        System.out.println(cpu.toString());
        System.out.println(gpu.toString());
        System.out.println(ram.toString());
        System.out.println(ssd.toString());
        System.out.println(motherboard.toString());
    }
}
