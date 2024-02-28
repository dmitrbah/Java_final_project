import java.util.Objects;

public class Laptop {

    private String model;
    private int serialNumber;
    private int ram;
    private int capacityHD;
    private String os;
    private String color;

    public Laptop(String model, int serialNumber, int ram, int capacityHD, String os, String color) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.ram = ram;
        this.capacityHD = capacityHD;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }  

    public int getCapacityHD() {
        return capacityHD;
    }

    public void setCapacityHD(int capacityHD) {
        this.capacityHD = capacityHD;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model = '" + model + '\'' +
                ", serial number = " + serialNumber +
                ", RAM = " + ram +
                ", capacity HD = " + capacityHD +
                ", OS = '" + os + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return laptop.model.equals(model) &&
                laptop.serialNumber == serialNumber &&
                laptop.ram == laptop.ram &&
                laptop.capacityHD == laptop.capacityHD &&
                laptop.os.equals(os) &&
                laptop.color.equals(color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serialNumber, ram, capacityHD, os, color);
    }
}