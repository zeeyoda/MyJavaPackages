package day33;

public class Ziyoda_Practice_Return_Calculate {
    public static void main(String[] args) {
       // System.out.println(getSumFrom1toX(10));
        //System.out.println(buildEmail("Ziyoda","Mahsut"));
        //System.out.println(buildEmail2("Ziyoda Mahsut"));

        String fullName = "Susan Cure";
        String[] fullNameSplit = fullName.split(" ");
        String herEmail = buildEmail(fullNameSplit[0], fullNameSplit[1]);
        System.out.println(herEmail);

    }
    public static int getSumFrom1toX(int num){
        int sum = 0;
        for (int i = 1; i <=num; i++) {
            sum+= i;

        }
        return sum;
    }
    public static String buildEmail(String firstName, String lastName){
        String email = firstName.charAt(0)+lastName+"@gmail.com";


        return email;
    }
    public static String buildEmail2(String name){
        String email = "";

        int space = name.indexOf(" ");
        email = name.charAt(0)+name.substring(space+1, name.length())+"@gmail.com";

        return email;
    }


}
