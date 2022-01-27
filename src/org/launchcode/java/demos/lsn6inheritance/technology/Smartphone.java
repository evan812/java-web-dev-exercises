package org.launchcode.java.demos.lsn6inheritance.technology;

public class Smartphone extends Computer{
    private int numOfApps;
    private int numOfPhotos;

    public Smartphone(int storage, int ram, String gpu, int numOfApps, int numOfPhotos) {
        super(storage, ram, gpu);
        this.numOfApps = numOfApps;
        this.numOfPhotos = numOfPhotos;
    }

    public void takePhoto(){
        this.numOfPhotos = this.numOfPhotos +1;
    }

    public void downloadApp(){
        this.numOfApps = this.numOfApps +1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public int getNumOfPhotos() {
        return numOfPhotos;
    }


}
