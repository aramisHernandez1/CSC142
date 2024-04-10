package SortAlgrothims;
import java.util.Arrays;


public class InsertionSort {

    public static void main(String[] args){
        int[] data = {4, -3, 0, 11, -2, 13, 5, 9};

        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                swap(num1, num2);
            }
        }
        System.out.println(Arrays.deepToString(data));
    }

    private void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
