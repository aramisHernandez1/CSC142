public class Arrays {
    
    public static void main(String[] args) {
        int[][] A = {{4,5}, {2,1}, {9,0}};
        int sum = 0;

        
        for(int i = 0; i < A.length; i++){
            sum = 0; //So we count out each part
            for(int j = 0; j < A[i].length; j++){
                sum += A[j][i];
            }
            System.out.println(sum);
        }
    }
}
