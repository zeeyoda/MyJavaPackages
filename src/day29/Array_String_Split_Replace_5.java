package day29;

public class Array_String_Split_Replace_5 {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        //hide this hero identity
        //String heroX = "Superman-**************;

        //given a String with hero code and name separated by dash
        //turn this String into hero code and * with same length as her name

        //Logic:

        // split it by dash to get the code and full name
        //get the length of full name
        //generate stars with same length as full name character count
        //concatenate hero code with dash and star and save it
        // or once the star is generated replace full name with stars

        String[] heroSplit = hero1.split("-");
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        int nameCharCount = fullName.length();
        String star = "";
        for (int i = 0; i < nameCharCount; i++) {
            star = star+"*";
        }
        System.out.println(fullName);
        System.out.println(star);

        String heroX = heroCode+"-"+star;
        System.out.println("hero1 = "+ hero1);
        System.out.println("heroX = "+ heroX);
    }
}
