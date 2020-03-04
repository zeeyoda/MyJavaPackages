package day31;

import day22.CanvasDayModuleLinkGenerator;

public class Method_Voting_10 {
    public static void main(String[] args) {
        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);
        //below cannot access the method parameter outside the method
        //System.out.println(age);

        int youAge =12;
        checkEligibility(youAge);

        }
    //this method has one int parameter called age
    //whoever calling this method needs to provide a number
    // it will set the value of age into that number
    //method parameter can be only accessible within the method parameter
        public static void checkEligibility(int age){
            //int age = 15;
            if(age>18){
                System.out.println("You are eligible");
            }else{
                System.out.println("you are not eligible");
        }

    }
}
