package day22;

public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {

    /*Here is the direct links to lead you to correct days
https://learn.cybertekschool.com/courses/278/modules#3317
this will lead you to day 21
https://learn.cybertekschool.com/courses/278/modules#3318
this will lead you to day 22
https://learn.cybertekschool.com/courses/278/modules#3319
this will lead you to day 23
https://learn.cybertekschool.com/courses/278/modules#3320
this will lead you to day 24
and so on*/

    String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
    String dayMsg = "This will lead you to this";
       // for (int moduleNumber = 3317; moduleNumber <=3317+35; moduleNumber++) {
       //     System.out.println(moduleNumber);

                for (int day = 21; day <=56; day++) {
            System.out.println(dayMsg + day);
            //if day is 21 moduleNumber is 3317 per requirement
            // if day is 22 moduleNumber is3318
                    System.out.println(baseURL + (3317-21 + day));

        }

    }
}
