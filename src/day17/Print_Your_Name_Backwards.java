package day17;

public class Print_Your_Name_Backwards {
    public static void main(String[] args) {

       //Print your name in reverse order without knowing the length
        //pick the last character of your name
        //then keep picking backwards until the first character
        //               01234567  index = count - 1
        String myName = "Ablatjan";
        //               12345678  count = name.length()
        int lastCharIndex = myName.length()-1;
        while( lastCharIndex >= 0){
            System.out.println("index" + lastCharIndex + " : " + myName.charAt( lastCharIndex) );
            --lastCharIndex;
        }
    }
}
