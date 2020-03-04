package day20;

public class PalindromeTest_ReadsTheSameBackwards {
    public static void main(String[] args) {
        //palindrome is a word that read the same backwards.
        //If a String is reversed but word doesnt change it is a Palindrome String
        //level, kayak, aziza, madam, elle
        String name = "kayak";
        System.out.println("name = " + name);
        String reversedName = "";

        for (int x = name.length()-1; x>=0 ; x--){
            reversedName = reversedName + name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);

        if(name.equalsIgnoreCase(reversedName)) {
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test has failed");
        }
    }
}
