package day14;

public class Email_Checker {

public static void main(String[] args) {
    //create an email: if it doesnt contain char @ say invalid  email,
    //if it contains space say invalid email
    //if it endsWith @gmail.com -->> gmail
    //if it endsWith @yahoo.com -->> yahoo email
    //if it endsWith @mail.ru ->> russian email



       /* String password = "Country@";
        boolean mustContain = !password.contains("@");
        boolean endWith = !password.endsWith("@gmail.com, @yahoo.com, @mail.ru");
        if (mustContain && endWith) {
            System.out.println("Valid password");
        }else{
            System.out.println("No Entry");
        }
*/
    String email = "abckungfu@yahoo.com";
    if (!email.contains("@") || email.contains(" ")) {
        System.out.println("invalid email");
    } else if (email.endsWith("@gmail.com")) {
        System.out.println("google mail");
    } else if (email.endsWith("@yahoo.com")) {
        System.out.println("yahoo mail");
    } else if (email.endsWith("@mail.ru")) {
        System.out.println("russian mail");

    }
    }
}
