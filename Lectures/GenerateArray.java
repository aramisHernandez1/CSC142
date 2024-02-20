package Lectures;

import java.util.Random;

public class GenerateArray {
    public static void main(String[] args) {
        int[] A = new int[5];
        Random number = new Random();

        for(int i = 0; i < A.length; i++){
            A[i] = number.nextInt(100);
            System.out.println(A[i]);
        }
    }
    
}
