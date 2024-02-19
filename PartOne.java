import java.util.*;

/*Homework Objective:To get the users value and index. Afterwards,
insert that value into that index without replacing the current index.
(So move the rest +1 index to the right.)


Did not account for invaild inputs, such as strings doubles etc.*/
public class PartOne {
    public static void main(String[] args) {
        //Initalize input and arrays..
        Scanner keyboard = new Scanner(System.in);
        int[] data = {91, 36, 65, 91, 45, 66, 11, 0, 2, 6, 13};

        //Get user input.
        System.out.print("Please enter your value:");
        int userValue = keyboard.nextInt();
        System.out.print("Please enter the index of this value:");
        int userIndex = keyboard.nextInt();

        //Limit index to avoid errors. 
        userIndex = limit(userIndex, data.length, 0); //No negative indexs in java.

        //Create new array and slot in value at index.
        int[] newData = insertValue(data, userIndex, userValue);

        //Print/Display out arrays.
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(newData));

        keyboard.close();
    }

    private static int[] insertValue(int[] orignal, int index, int newValue){
        int[] output = new int[orignal.length+1];

        boolean flag = false;

        //Start off with putting value into slot. 
        //This is so we know where this value is.
        output[index] = newValue;

        for(int i = 0; i < orignal.length; i++){
            if(i == index) flag = true;

            /*We know where the new value is.
            So we check if we put old values into next index. */
            if(flag){
                output[i+1] = orignal[i];
            }
            else output[i] = orignal[i]; //Otherwise just copy array values.
        }
        return output;
    }

    //Basic limit method to limit index.
    private static int limit(int value, int max, int min){
        if(value > max) value = max;
        if(value < min) value = min;

        return value;
    }
}
