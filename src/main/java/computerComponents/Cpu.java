package computerComponents;

public class Cpu {
    private String name;
    private double price;
    private int cacheMemory;
    private double frequency;
    private int cores;

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

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
