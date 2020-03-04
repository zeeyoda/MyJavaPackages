package day14;

public class String_Method_UserName_Password_Practice {
    public static void main(String[] args) {
        //password validator
        //minimum 8 char max 16 char
        //it must contain _ or $
        //it must not contain space
        //it must start with AB
        //if any of above condition does not match, say invalid password
        //else say good password
        String password = "AbSH2723_gfg$su";
        boolean min8max16 = password.length()>=8 && password.length()<=16;
        boolean mustContain_Or$ = password.contains("_") || password.contains("$");
        boolean mustNotContainSpace = !password.contains(" ");
        boolean mustStartWith = password.startsWith("Ab");
        if(min8max16 && mustContain_Or$ && mustNotContainSpace && mustStartWith) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid password");
        }
    }

}
