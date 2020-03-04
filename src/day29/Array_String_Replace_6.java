package day29;

public class Array_String_Replace_6 {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";
        String[] heroSplit = hero1.split("-");
        //String heroCode = heroSplit[0];
        //String fullName = heroSplit[1];

        String stars = "";
        for (int i = 0; i < heroSplit[1].length(); i++) {
            stars += "*";
        }
        System.out.println(stars);

        //String heroX = hero1.replace(heroSplit[1], stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(heroSplit[1], stars));

    }
}
