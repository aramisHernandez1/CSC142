public class FibonacciSequence {


    public static void main(String[] args){
        int n = 60;
        System.out.printf("%d from %d", FibonacciCalc(n), n);
    }

    public static int FibonacciCalc(int n){
        if(n == 0 || n == 1){
            return 1;//F(1) && F(0) are always 1.
        }

        else return FibonacciCalc(n-1) + FibonacciCalc(n-2); //Sequence always take two previous elements and add them together to get current element. 
    }
}
