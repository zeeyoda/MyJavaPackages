package day09;

public class DayPrinter1 {
    public static void main(String[] args) {

        int dayCode = 7;
        String dayName = ""; // assigning an empty String Value, this String has an empty value
       // String dayName; //this String doesnt have a value

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
        } else if (dayCode == 7) {
            dayName = "Sunday";
        } else {
            dayName = "Unknown";
            System.out.println("Day is " + dayName);

        }
    }
}
