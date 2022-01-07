package exercises;

public class Array {
    public static void main(String[] args){
        int[] myArray = {1, 1, 2, 3, 5, 8};

        for (int i : myArray){
            if (myArray[i] % 2 != 0){
                System.out.println(myArray[i]);
            }
        }
    }
}
