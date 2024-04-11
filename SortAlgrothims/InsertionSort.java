package SortAlgrothims;
import java.util.Arrays;


public class InsertionSort {

    public static void main(String[] args){
        int[] data = {4, -3, 0, 11, -2, 13, 5, 9};

        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                int temp = data[i-1];
                data[i-1] = data[i];
                data[i] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
