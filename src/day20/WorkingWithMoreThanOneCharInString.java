package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {

        // given a String with even number character count
        //print 2 characters in one line
        //for example : Gokyuzum
        String name = "Gokyuzum";
        System.out.println( name.substring(0, 2));
        System.out.println( name.substring(2, 4));
        System.out.println( name.substring(4, 6));
        System.out.println( name.substring(6,8));

        int x = 0;
        System.out.println( name.substring(x, x+2));
        x=x+2;
        System.out.println( name.substring(x, x+2));
        x=x+2;
        System.out.println(name.substring(x, x+2));
        x=x+2;
        System.out.println(name.substring(x, x+2));

        //my condition is x<=charCount-2

        String name1 = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount-1;

        //my condition is x<=charCount-2 or x<=lastCharindex-1
        for(int y = 0; y<=lastCharIndex-1 ; y+=2){
            System.out.println( name.substring (y, y+2));
        }
    }
}
