public class Factorial {
    
    public static void main(String args[]){
        int n = 7;
        System.out.printf("%d! = %d", n, FactorialCalc(n));


    }

    public static int FactorialCalc(int n){
        int fact = 1;
        for(int i =1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    //Recursive function always will have a function call itself.
    public class RecursiveWay{
        public static int fact(int n){
            int i;

            if(n==1) return 1; //Every recursive program must have a base case.
            else return (n*fact(n-1)); //Recursive call/case.

            //5 * fact(4);
            //5*4*fact(3)
            //5*4*3*fact(2)
            //5*4*3*2*fact(1)
        }
    }
}


