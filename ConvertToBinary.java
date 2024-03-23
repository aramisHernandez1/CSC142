import java.util.*;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        RecursiveToBinary(num);

        input.close();
    }

    public static String IncersiveToBinary(int num){
        String result = "";

        while(num != 0){
            int r = num % 2;
            num /= 2;

            result = r + result;
        }

        return result;
    }

    public static void RecursiveToBinary(int num){
        if(num == 0){
            return;
        }
        RecursiveToBinary(num/2);
        System.out.print(num%2);
    }
    
}
