public class EvenOdd2DArray {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 6, 9}, {2, -1, 3}};

        int evenNum = 0, oddNum = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] % 2 == 0){
                    evenNum ++;
                }
                else oddNum++;
            }
        }

        System.out.printf("Even:%d\nOdd:%d", evenNum, oddNum);
    }
}
