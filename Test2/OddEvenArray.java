package Test2;

import java.util.Arrays;

public class OddEvenArray {


    //Key things to note:
    //Array is not sorted
    //Get access to two arrays
    //Left side is even 
    //Right side is odd
    //Duplicates are allowed
    public static void main(String[] args) {

        //time  complexity:O(n) 
        //Space complexity:O(n)

        //Input array
        int[] input = {11, 2, 31, 4, 5, 0};
        int[] output = new int[input.length]; //Initalize output
        int counter = 0; //Create a pointer

        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){ //Check if even then place in pointer index then increment
                output[counter++] = input[i];
            }
        }

        //Same thing for odd as even
        for(int j = 0; j < input.length; j++){
            if(input[j] % 2 == 1){
                output[counter++] = input[j];
            }
        }

        //Prints elements in array in neat format.
        printArray(output);

    }

    private static void printArray(int[] array){
        System.out.print("{");
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.print("}");
    }

}
