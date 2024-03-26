package HW2;

public class Date {
    //Basic month day and year 
    private int month;
    private int day;
    private int maxDay;
    private int year;

    //init of class
    public Date(int month, int day, int year){
        //Limit month to ensure it is a valid integer input.
        this.month = limitLoop(month, 12, 1);

        this.maxDay = daysInMonth(); //Get max days in currect month
        this.day = limit(day, maxDay, 1); //Limit days to ensure again it is vaild
        this.year = year;
    }

    //Getters
    public int getMonth(){
        //Gets the months interger value
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        String output = "";
        output = output.format("%d/%d", this.month, this.day);
        return output;
    }


    //Returns objects max days in current month
    public int daysInMonth(){
        switch (month) {
            case 2:
                return leapYear(this.year); //Checks for leap year and returns 
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; //If any of these case we have 30 days in the month

            default: //Rest of months have 31.
                return 31;
        }
    }

    //Returns the days in month passed
    public int daysInMonth(int month){
        switch (month) {
            case 2:
                return leapYear(this.year); //Checks for leap year and returns 
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; //If any of these case we have 30 days in the month

            default: //Rest of months have 31.
                return 31;
        }
    }

    //To do: Need to make the days add loop 
    public int daysToNextDate(Date nextDate){

        int days = 0;

        if(nextDate.day != this.day && nextDate.month != this.month){
            days = this.daysInMonth() - this.day; //Get the difference of max days in current month and day and add it to the days needed to pass.
        }
        
        int i = this.month;

        while(i != nextDate.month){
            i++;
            i = limitLoop(i, 12, 1);
            if(i == nextDate.month){
                days += nextDate.day;
                break;
            }
            days += daysInMonth(i);
        }
        return days;

    }


    //Used to limit base inputs if user inputs to high of an value
    private int limit(int value, int max, int min){
        if(value > max){
            return max;
        }
        else if(value < min){
            return min;
        }

        return value;
    }


    //Used to loop through months of the year example 12 to 1.
    private int limitLoop(int value, int max, int min){
        if(value > max){
            return min;
        }
        else if(value < min){
            return max;
        }

        return value;
    }
    

    //Leap year method to return the correct max date of feburary.
    private int leapYear(int year){
        if(year % 4 != 0){
            return 28;
        }

        return 29; 
    }


    
}
