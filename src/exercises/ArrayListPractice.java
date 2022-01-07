package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(6);
        numbs.add(8);
        numbs.add(9);
        numbs.add(10);
        numbs.add(11);
        numbs.add(12);
        numbs.add(25);

        int sum = sumOfEvens(numbs);
        System.out.println(sum);

        ArrayList<String> five = new ArrayList<>();
        five.add("LaunchCode");
        five.add("Coding");
        five.add("Frank");
        five.add("Movie");
        five.add("Rusl");
        five.add("Hey");
        five.add("Hi");
        five.add("Rocket");

        wordLength(five);

    }
    public static Integer sumOfEvens(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                sum += list.get(i);
            }
        }
        return sum;
    }
    public static void wordLength(ArrayList<String> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length you would like to search: ");
        int length = input.nextInt();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == length){
                System.out.println(list.get(i));
            }
        }
    }

}
