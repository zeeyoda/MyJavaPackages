package ziyodaPractice;

public class ShirtSize_String_IfElse {

    public static void main(String[] args) {

        String size = " ";
        int orderNumber = 3;
        if (orderNumber == 1) {
            System.out.println("You have selected 1");
            size = "Large";
        } else if (orderNumber == 2) {
            System.out.println("You have selected 2");
            size = "Medium";
        } else if (orderNumber == 3) {
            System.out.println("You have selected 3");
            size = "Small";
        } else {
            System.out.println("You have selected invalid number");
            size = "Invalid";
        }
        System.out.println("Your size is " + size);

        }
    }

