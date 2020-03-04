package ziyodaPractice;

import java.util.Arrays;

public class Repl_204_isAnagram {
    public static void main(String[] args) {
       // each letter in word1 should appear in word2 exact number of times
       // ignore empty spaces
       // make your code case insensitive
        String a = "silant";
        String b = "listjn";
        String[] aS = a.toLowerCase().replace(" ", "").split("");
        String[] bS = b.toLowerCase().replace(" ","").split("");
        Arrays.sort(aS);
        Arrays.sort(bS);
        System.out.println(Arrays.equals(aS,bS));
        /* char[] a1 = a.toCharArray();
         char[] b1 = b.toCharArray();
         Arrays.sort(a1);
         Arrays.sort(b1);
         String a1sorted = new String(a1);
         String b1sorted = new String(b1);

         if(a1sorted.equals(b1sorted)){
             System.out.println(isAnagram);
         }else{
             System.out.println(!isAnagram);
         }*/

    }
        }





