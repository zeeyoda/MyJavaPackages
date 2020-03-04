package day09;

public class GreetingTaskSwitch {
    public static void main(String[] args) {

        int languageOp = 6 ;

        switch (languageOp) {
            case 1 :
                System.out.println("Hola");
                break;
            case 2 :
                System.out.println("Salam");
                break;
            case 3 :
                System.out.println("Privet");
                break;
            case 4 :
                System.out.println("Ni Hao");
                break;
            case 5 :
                System.out.println("Merhaba");
                break;
             default :
                 System.out.println("Sorry, we do not have your language");



        }
    }
}
