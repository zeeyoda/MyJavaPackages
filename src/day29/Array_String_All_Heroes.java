package day29;

public class Array_String_All_Heroes {

    public static void main(String[] args) {
        String[] heroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};
        for (String eachHero : heroes) {
            System.out.println("eachHero = " + eachHero);
            String hero1 = eachHero;
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
}
