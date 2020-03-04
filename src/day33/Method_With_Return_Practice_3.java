package day33;

public class Method_With_Return_Practice_3 {
    public static void main(String[] args) {
        System.out.println(convertNumberToDay(3));
        System.out.println(getTheDayOfTheWeek(5));


        int[] allCodes = {5,3,11,4,33};
        for(int x=0; x<allCodes.length; x++){
            String day = getTheDayOfTheWeek(allCodes[x]);
            System.out.println("day= "+day);
        }
        System.out.println("------------------------------");
        for (int eachDayCode: allCodes) {
            System.out.println("each day " + getTheDayOfTheWeek(eachDayCode));

        }
    }


   /* public static int bunchOfDayCodes(){
        int
    }*/
    public static String getTheDayOfTheWeek(int daynum){
        String[] daysArray ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String day = "";
        if(daynum>0 && daynum<=7) {
            day = daysArray[daynum - 1];
        }else{
            day="Funday";
        }
        return day;
    }
    public static String convertNumberToDay(int dayCode) {
        String weekday = "";
        switch (dayCode) {
            case 1:
                return "Monday";
               // weekday ="Monday";
               // break;
            case 2:
                return "Tuesday";
                //weekday = "Tuesday";
                //break;
            case 3:
                return "Wednesday";
                //weekday="Wednesday";
                //break;
            case 4:
                return "Thursday";
                //weekday="Thursday";
                //break;
            case 5:
                return "Friday";
                //weekday="Friday";
                //break;
            case 6:
                return "Saturday";
               // weekday="Saturday";
                //break;
            case 7:
                return "Sunday";
                //weekday ="Sunday";
                //break;
            default:
                return "Funday";
                //weekday = "Funday";
        }
        //return weekday;
    }

        }


