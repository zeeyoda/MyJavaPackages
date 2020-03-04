package day11;

public class RoomsWithChar {
    public static void main(String[] args) {
        String room1 = "Bedroom";
        String room2 = "Kitchen";
        String room3 = "Basement";
        char room = '1';

        switch (room) {
            case '1':
                System.out.println("Your turned on bedroom light.");
                break;
            case '2':
                System.out.println("You turned on kitchen light");
                break;
            case '3':
                System.out.println("You turned on basement light");
                break;
            default:
                System.out.println("That light is not working");
        }
    }
}