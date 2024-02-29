package Assignments;
//Aramis Hernandez
//CSC 142 9:30am
//Exam 1: Feb 22 9:30 

//Part One:

import java.util.Scanner;

public class Exam1Q1 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your value:");
        int value = input.nextInt();
        int index = GetIndex(data.length);

        int[] newData = insertValue(data, index, value); //Method to inset value and copy data.
        
        for(int i = 0; i < newData.length; i++){
            System.out.print(newData[i] + " ");
        }

        input.close();
    }

    private static int[] insertValue(int[] orignal, int index, int newValue){
        int[] output = new int[orignal.length+1];

        boolean flag = false;

        output[index] = newValue;

        for(int i = 0; i < orignal.length; i++){
            if(i == index) flag = true;

            if(flag){
                output[i+1] = orignal[i];
            }
            else output[i] = orignal[i];
        }
        return output;
    }

    private static int GetIndex(int length){
        int index;
        if(length % 2 == 0) index = length/2; // Just divide length by two since indexs are already offset by 1.
        else index = length/2 +1; //Offset by one because of floored division

        return index;
    }

}
