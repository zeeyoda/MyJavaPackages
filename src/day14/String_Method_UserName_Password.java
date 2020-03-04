package day14;

public class String_Method_UserName_Password {
    public static void main(String[] args) {
        //Password Validator:
        //minimum 8 char
        //max 16 char
        //it must contains _ or $
        //no space, must start with Ab
        //if any of the above condition say Invalid password
        //else say Good Password

        String password = "Ab_Dinosaurs";
        //min 8 char, max 16
        boolean min8max16 = password.length() >=8 && password.length() <=16;

        //It must contain _ OR $
        boolean mustContain_or$ =  password.contains("_") || password.contains("$");

        //it must not contain space
        boolean mustNotContainSpace = !password.contains(" ");

        // It must start with Ab
        boolean mustStartWith = password.startsWith("Ab");

        if(min8max16 && mustContain_or$ && mustNotContainSpace && mustStartWith) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
