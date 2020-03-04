package day34;

public class Method_LoginActivity {
    public static void main(String[] args) {


        // Create a class called LoginActivity with main method
        // create 2 login methods
        //login1: static method
        //  -->>it has two String userName and passWord as method parameters
        //  -->> it accepts 2 String objects as argument when being called
        //  -->> it checks whether username and password are "user" and "abc123"
        //      if yes -->> print login successful
        //      else -->> print login failed



        //login2: static method boolean return type
        //  -->>it has two String userName and passWord as method parameters
        //  -->> it accepts 2 String objects as argument when being called
        //  -->> it checks whether username and password are "user" and "abc123"
        //      if yes -->> return true
        //      else -->> return false


        System.out.println(getLogin1("fhyt", "bnhg5"));
        //System.out.println(getLogin("user","abc123"));// cannot print out void method this way
        getLogin("abc","abc521");

        boolean result2 = getLogin1("abc","abc123");
        System.out.println(result2);
        if(getLogin1("user1","abc123")) {
            System.out.println("Add Java book to your cart");
        }else{
            System.out.println("No Shopping unless you sign in!!");
        }
    }
    public static void getLogin(String userName, String password) {

        if (userName.equals("user") && password.equals("abc123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login failed");
        }


    }
    public  static boolean getLogin1(String userName1, String password1){

        if(userName1.equals("user")&&password1.equals("abc123")){
            return true;
        }
        return false;

    }
}
