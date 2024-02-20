package Lectures;
public class Test7 {
    public static void main(String[] args) {
        int[] A = {1, 20, -5, 0};
        int[] B = {11, 20, 0, 99};

        Com(A, B);
    }


    public static void Com(int[] A, int[] B){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(A[i] == B[j]) System.out.println(A[i]);
            }
        }
    }
}
