package day25;

import java.util.Arrays;

public class Ziyoda_ToCharray_Method_Practice {
    public static void main(String[] args) {
        String name = "Ziyoda";
        //char[] namesChar = name.toCharArray();
        //System.out.println(Arrays.toString(namesChar));

        //long way solution to the problem above
        char[] namesChar = new char[name.length()];
        for (int i = 0; i <name.length() ; i++) {
            namesChar[i]=name.charAt(i);
            //System.out.print(namesChar[i]+" ");//this prints it as String

        }

        System.out.println("namesChar = "+ Arrays.toString(namesChar));

      /*  String movie = " Till we meet again";
        char[] movieChar = new char[movie.length()];
        for(int i=0; i<movie.length(); i++){
            movieChar[i]=movie.charAt(i);
        }
        System.out.println("movieChar = "+Arrays.toString(movieChar));
        */



    }
}
