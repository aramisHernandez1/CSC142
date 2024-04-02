package Test2;

import java.util.Scanner;

public class BinaryPryamid {
    public static void main(String[] args) {
        //Get user input
        Scanner keyboard = new Scanner(System.in);
        //Note enter size 5 to get the correct pattern 
        System.out.print("Please enter the size of your pryamid(Size 5 to get exact pattern from exam.):");
        int inputSize = keyboard.nextInt();

        //Prints out binary pryamid size
        PrintPryamid(inputSize);
    }

    private static void PrintPryamid(int size){
        for(int i = 0; i < size+1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(j%2);
            }
            System.out.println();
        }

    }
    
}
