package computerComponents;

public class Motherboard {
    private String name;
    private double price;
    private Gpu gpu = new Gpu();
    private Cpu cpu = new Cpu();
    private Ram ram = new Ram();
    private Ssd ssd = new Ssd();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
}
