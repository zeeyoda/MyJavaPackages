package day08;

public class WarmUpTask1 {

    public static void main(String[] args) {
        /* Task1
        *Voting Eligibility Program
        * Create a variable called age as int
        * check whether this age is more than 18
        * if yes print: you are ready to vote !!!
        * if it is less than 18 wait until you are 18
         */
        int age = 17;
        System.out.println(age >=18);

        // dont use ; for if statement | use { after if statement and make sure to close it
        if ( age>=18) {
            System.out.println("You can vote");
        } else {
            System.out.println(age < 18);
            System.out.println("Wait till you are 18");
        }


    }
}
