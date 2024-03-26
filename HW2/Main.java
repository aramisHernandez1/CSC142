package HW2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Get input
        Scanner input = new Scanner(System.in);

        int[] today = getUserDate(input, "Please enter todays date(one part at a time month-day-year) ");
        int[] birthday = getUserDate(input, "Now please enter your birth date (in the same format) ");

        Date currentDate = new Date(today[0], today[1], today[2]);
        Date birthDate = new Date(birthday[0], birthday[1], birthday[2]);

        //Tell user their birth date.
        System.out.println("Your birth day is " + birthDate.toString());
        int daysAway = currentDate.daysToNextDate(birthDate); // Days away to the users entered birthday.

        //Prints output based on how many days away user birthday is.
        if(daysAway == 0 && currentDate.getYear() == birthDate.getYear()){
            System.out.println("YOU WERE JUST BORN GEEZ!!!!");
        }
        else if(daysAway == 0){
            System.out.println("\nHappy Birthday!!!");
        }
        else System.out.printf("\n\nYour birthday is %d days away.", daysAway);


    }

    //Gets the users date and stores it into an array.
    public static int[] getUserDate(Scanner input, String message){
        System.out.println(message);
        String inputMessage;
        int[] output = new int[3]; //Only 3 slot for dates hardcoded.
        for(int i = 0; i < output.length; i++){
            inputMessage = userMessage(i);
            System.out.print(inputMessage);

            output[i] = input.nextInt();

        }
        return output;
    }
    
    //Format for the usermessage when getting user input.
    private static String userMessage(int i){
        String message = "";

        switch(i){
            case(0):
            return message = "Please enter the month:";
            case(1):
            return message = "Please enter the day:";
            case(2):
            return message = "Please enter the Year:";
        }
        return message;
    }
}
