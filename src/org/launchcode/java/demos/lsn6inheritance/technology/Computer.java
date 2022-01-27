package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity{
    private int storage;
    private int ram;
    private String gpu;
    private boolean hasRGB;

    public Computer(int storage, int ram, String gpu) {
        this.storage = storage;
        this.ram = ram;
        this.gpu = gpu;
    }

    public void increaseRam(int ramNumber){
        this.ram = this.ram + ramNumber;
    }

    public void increaseStorage(int storageNum){
        this.storage = this.storage + storageNum;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }


}
