package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "user" , password = "pass";//we can declare and assign value if it is
                                                           //multiple variables of same type


        if( userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login Successful");
        }else if(!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("User name is not correct");
        }else if( userName.equals("user123") && !password.equals("pass213")) {
            System.out.println("Password is not correct");
        }else{
            System.out.println("username and password are incorrect");
        }
    }
}
