package Lectures;

import java.util.*;

//Total number of times a item is repeated in one dimensional array.
public class ElementFromUser {

    public static void main(String[] args) {
        int[] A = {1, -1, 0, 2, 12, 200, 3, 7, 10};
        int temp, counter = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a value to check:");
        temp = keyboard.nextInt();

        for(int i = 0; i < A.length; i++){
            if(A[i] == temp) counter++;
        }
        System.out.printf("Your number appeared %d times.", counter);
    }
    
}
