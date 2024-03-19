public class SigmaSummation {
    
    public static void main(String[] args) {
        System.out.println(itterationMethod(2));
        System.out.println(RecursiveWay(2));
    }


    public static int itterationMethod(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += n-i;
        }

        return sum;
    }

    public static int RecursiveWay(int n){
        if(n == 0 || n == 1) return n;
        else return n + RecursiveWay(n-1);
    }
}
