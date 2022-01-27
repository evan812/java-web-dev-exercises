package org.launchcode.java.demos.lsn6inheritance.technology;

public class Program {
    public static void main(String[] args) {
        Computer dellComputer = new Computer(500, 16, "GeForce RTX 3080");
        System.out.println(dellComputer.getId());

//        System.out.println("The current storage is "+ dellComputer.getStorage());
//        System.out.println("The current ram is "+ dellComputer.getRam());
//        System.out.println("The current graphics card is "+ dellComputer.getGpu());
//        dellComputer.increaseStorage(250);
//        dellComputer.increaseRam(16);
//        System.out.println("The new storage is "+ dellComputer.getStorage());
//        System.out.println("The new ram is "+ dellComputer.getRam());

        Laptop helios = new Laptop(300,8, "GeForce RTX 1070", 20);
//        System.out.println(helios.isClunky());
//        System.out.println(helios.getWeight());
//        System.out.println(helios.getGpu());
        System.out.println(helios.getId());

        Smartphone samSung = new Smartphone(250, 8, "NA", 32, 521);
//        System.out.println(samSung.getNumOfPhotos());
//        System.out.println(samSung.getNumOfApps());
//        samSung.downloadApp();
//        samSung.takePhoto();
//        System.out.println(samSung.getNumOfPhotos());
//        System.out.println(samSung.getNumOfApps());
        System.out.println(samSung.getId());
    }
}
