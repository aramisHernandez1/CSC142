package Lectures;

public class OddEvenSort {

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 6, 9, 0, 3};
        int evenNums = 0, oddNums = 0;

        for(int i = 0; i < A.length; i++){
            
            if((A[i] % 2) == 0) evenNums++;
            else oddNums++;
        }
        

        System.out.printf("Even = %d, Odd = %d", evenNums, oddNums);
    }
    
}
