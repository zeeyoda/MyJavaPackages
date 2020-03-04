package day31;

public class delete {
    public static void main(String[] args) {
        //spell your name z-i-y-o-d-a

        String myName= "Saida";
        for (int i = 0; i <myName.length()-1 ; i++) {

            System.out.print(myName.charAt(i)+"-");

        }
        System.out.println(myName.charAt(myName.length()-1));
    }
}
