package OfficeHour;

import org.w3c.dom.ls.LSOutput;

public class Practice_12_18_Practice {
    public static void main(String[] args) {
        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";
        // print job title Electrical Engineer


        int startingIndex = employee.indexOf("[")+1;
        int endingIndex = employee.indexOf("]");
        System.out.println(        );
        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title "+ title);


        //logic 1: get first word in the sentence
        //get las name (second word) in this sentence and put dash in between
        //then concatenate
        //this will break if we have a name that has more than 2 words

        //logic 2: get the full name directly
        //  replace all the space in full name with dash and concatenate with title

        String fullName = employee.substring(0, employee.indexOf(" ["));//space and opening square bracket
        System.out.println("fullName = "+fullName);

        //generate this result Philipa-Salthouse Electrical Engineer
        String fullNameWishDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash "+fullNameWishDash);

        System.out.println(fullNameWishDash+" "+title);

        //TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
        }
        //Given expected title for title for Philipa Salthouse is Electrical Engineer
        //Write a if statement to check if it is correct or not
        */
        if(title.equals("Electrical Engineer")){
            System.out.println("PASS: Verification successfull");
        }else{
            System.out.println("Fail: Verification fail: "+title);
        }
        //Task 4: print initials and job title in this format PS -> Electrical Engineer
        //Logic: get first word and last word of your full name and get first character of each name
        //first name might contain more than 2 words but we only want 2 characters for initials
        //I already have variable full name that contains fullName
        //get first character using charAt(0)
        //get lastname first character using charAt(lastIndexOfSpace+1)
        System.out.println(fullName.charAt(0)+""+fullName.lastIndexOf(" ")+1+" -> "+title);

    }
}
