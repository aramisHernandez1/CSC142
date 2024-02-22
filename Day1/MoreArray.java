package Day1;
public class MoreArray{

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}, {5,6}};
        int[][] B = {{1, -2}, {-3, -4}, {-5, -6}};
        int[][] C = new int[3][2];
        int sum = 0;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.println(C[i][j]);
            }
        }


    }
}