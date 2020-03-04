package day14;

public class Email_Checker_Practice {
    public static void main(String[] args) {

        //email checker -- if it does not contain character @ say invalid email
        //if it contains space say invalid email
        //if it endsWith @gmail.com -->> gmail
        //if it endsWith @yahoo.com -->> yahoo email
        //if it endsWith @mail.ru -->> russian email
        //if it doesn't contain @ say invalid email
        //if it contains space say invalid email

        String email = "gumball@yahoo.com";
         boolean atChecker = email.contains("@");
         boolean spaceChecker = !email.contains(" ");
         boolean endsWithGmail = email.contains("gmail.com");
         boolean endsWithYahoo = email.contains("yahoo.com");
         boolean endsWithMail =  email.contains("mail.ru");
         if( atChecker && spaceChecker || endsWithMail || endsWithYahoo || endsWithMail) {
             System.out.println("Valid email");
         }else{
             System.out.println("Invalid email");
         }

        /*if(!email.contains("@") && email.contains(" ")) {
             System.out.println("Invalid email");
         }else if( email.contains("gmail.com")) {
             System.out.println("Google Mail");
         }else if (email.contains("@yahoo.com")) {
             System.out.println("Yahoo mail");
         }else if (email.contains("@mail.ru")){
        System.out.println("Russian mail");
         }
         */


    }
}
