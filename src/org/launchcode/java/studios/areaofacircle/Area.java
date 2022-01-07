package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double area = 0;

        System.out.println("Enter a radius:");



        while (input.hasNext()){
            System.out.println("What is the radius?");
            try {
                if (input.hasNextDouble()) {
                    radius = input.nextDouble();
                    if (radius > 0) {
                        area = Circle.getArea(radius);
                        input.close();
                    }
                }

            }catch (IllegalStateException e){
                System.out.println(e);
            }

        }


        System.out.println("The area a circle of radius " + radius + " is: " + area );
    }
}
