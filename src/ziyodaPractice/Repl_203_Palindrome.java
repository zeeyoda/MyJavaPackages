package ziyodaPractice;

import java.util.Arrays;

public class Repl_203_Palindrome {
    public static void main(String[] args) {
        //isPalindrome("");
        // System.out.println(isPalindrome("Nurses Run"));
        String check = "wooden";
        String reverse = "";
         check = check.toLowerCase().replace(" ", "");
        // System.out.println(Arrays.toString(checkS));
        for (int i = check.length() - 1; i >= 0; i--) {
            reverse += check.charAt(i);
        }
        if(check.equals(reverse)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}




