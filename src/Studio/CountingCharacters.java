package Studio;

//import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingCharacters {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src/Studio/text";
        File myObj = new File(fileName);
        Scanner input = new Scanner(myObj);
        System.out.println(input);
        System.out.println("Enter a string: ");
        String inputPharase = input.nextLine();
        String lowercase = inputPharase.toLowerCase();
        lowercase = lowercase.replaceAll("[^a-z]", "");
        String str = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        characterCount(lowercase); // bringing the string into the created method.
    }
    static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); // initializing map

        char[] strArray = inputString.toCharArray(); //converts string to char array

        for (char c : strArray) { // checking each char of strArray(for each char in the array)
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1); // as long as the specific char is found keep adding to value by 1
            }
            else {
                charCountMap.put(c, 1); //if no other char is found then put 1 as value
            }
        }

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

