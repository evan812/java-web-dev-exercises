package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive:");
        Double miles = input.nextDouble();
        System.out.println("How much gas was consumed(gallons):");
        Double gas = input.nextDouble();

        Double mpg = miles/gas;
        System.out.println("Miles per gallon is: " + mpg + "MPG");
    }

}
