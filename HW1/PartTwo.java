package HW1;
import java.util.*;

//Homework objective to copy a 1*9 array into a two dimensional 3*3 array.

public class PartTwo {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //1*9 array.
        int[][] output = conversion(data);

        System.out.println(Arrays.deepToString(output));
    }


    //converts 1*9 array into 3*3.
    private static int[][] conversion(int[] Array){
        int[][] output = new int[3][3];
        //Counter so we can grab correct index on 1*9 array.
        int counter = 0;
    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                output[i][j] = Array[counter];
                counter++;
            }
    
        }
        return output;
    }
}

