package Lectures;

import java.util.*;

public class TwoDimensialPractice {
    public static void main(String[] args) {
        int[][] A = {{6, 0}, {3, 4}}; //2*2 2 rows 2 colums
        int[][] B = {{1}, {2}}; //2*1 2 rows one colum

        int[][] C = new int[2][1];

        for(int i = 0; i<A.length; i++){
            for(int j= 0; j < B.length; j++){
                for(int k = 0; k < B[i].length; k++){
                    C[i][k] = C[i][k] + (A[i][j] *  B[j][k]);
                }        
            }
        }

        System.out.println(Arrays.deepToString(C));
        


    }    

    
}
