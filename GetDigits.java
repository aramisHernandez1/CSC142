import java.util.*;

public record GetDigits() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String numChar = Integer.toString(num);

        for(int i = 0; i < numChar.length(); i++){
            System.out.println(numChar.charAt(i));
        }
    }
}
