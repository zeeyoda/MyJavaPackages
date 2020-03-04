package ziyodaPractice;

import java.util.Arrays;

public class Repl_119_Split {
    public static void main(String[] args) {
        String email = "myemail.com";
        String[] emailSplit = email.split("@");
       // String emailId = emailSplit[0];
       // String domain = emailSplit[1];
      //  System.out.println(Arrays.toString(emailSplit));
        if(emailSplit.length==2){
            System.out.println("Email id: "+ emailSplit[0]);
            System.out.println("Email domain: "+emailSplit[1]);
        }
        System.out.println("invalid email");
    }
}

