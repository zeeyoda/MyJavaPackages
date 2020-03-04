package day09;

public class FeverCheckWithSwitch {

    public static void main(String[] args) {

        int feverCheck = 98 ;
        switch (feverCheck) {
            case 104 :
                System.out.println("You need to go to ER right away!");
                break;
            case 103 :
                System.out.println("You need to call the doctor on call, NOW!");
                break;
            case 102 :
                System.out.println("Please take fever reducer every 4-6 hours.");
                break;
            case 100:
                System.out.println("You have low grade fever. Drink lots of fluid and rest.");
                break;
            default :
                if(feverCheck<=100){
                    System.out.println("You are fine. Go walk the dog");
                }
                else{
                    System.out.println("Your temp is extremely high!");
                }
        }
    }
}
