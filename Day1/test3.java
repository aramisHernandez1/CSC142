package Day1;
import java.util.Scanner;

public class test3{
    public static void main(String[] args){
        int m = 100;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name:");
        String name = input.nextLine();
        System.out.print("Please enter your age:"); 
        int age = input.nextInt();

        System.out.println("Your name is " + name + ".\n" + "You are " + age + " Years old.");


    }


}