package day31;

public class Method_Practice_4_Name_Spell {
    public static void main(String[] args) {
        reverseName();
        nameWithDash();

    }
    public static void reverseName(){
        String name = "Ziyoda";
        for (int x=name.length()-1; x>=0; x--){
            System.out.print(name.charAt(x));

        }
        System.out.println();
    }
    //spell your name z-i-y-o-d-a
    public static void nameWithDash(){
        String name = "Saida";
        for (int i = 0; i < name.length()-1 ; i++) {
            System.out.print(name.charAt(i)+"-");

        }
        System.out.print(name.charAt(name.length()-1));
        System.out.println();


    }
}
